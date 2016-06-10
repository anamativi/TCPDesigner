package UI;


import Service.Service;
import RLObjects.*;
import Service.Database;
import Service.notFoundInDatabase;
import java.util.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UserInterface {

    public Service service;
    private final static float MIN_GRADE=-3;
    private final static float MAX_GRADE=3;
    private final static float MIN_NUMREVIEWERS=3;
    private final static float MAX_NUMREVIEWERS=5;
    private final static int NUMBER_OF_OPTIONS=3;

    public UserInterface() {
    }

    public void UserInterface(Service service) {
        // TODO implement here
        //return null;
    }

    public void getCommand() {
        
        int loop = NUMBER_OF_OPTIONS+1;
        while(loop != 0){
            try{
            loop = new Scanner(System.in).nextInt();
            isValidUiInput(loop);
            }
            catch(InputMismatchException e){
                System.out.println("Incorrect input type, must be integer. Enter Again.");
            }
            catch(NotMenuOptionException e){
                System.out.println("The chouse input must be between 0 and " + NUMBER_OF_OPTIONS);
            }
            switch (loop) {
                case 1:
                    AllocArticleToMemberCommand allocCommand = new AllocArticleToMemberCommand();
                    allocCommand.execute();
                    break;
                case 2:
                    RateArticleCommand rateCommand = new RateArticleCommand();
                    rateCommand.execute();
                    break;
                case 3:
                    SelectArticleCommand selectArticleCommand = new SelectArticleCommand();
                    selectArticleCommand.execute();
                    break;
                default:
                    break;
            }
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public Conference readConference() {
        Database db = Database.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter conference:");
        
        String conferenceName = scanner.nextLine();
        Conference conference;
        try{
            conference = db.readConference(conferenceName);            
        }
        catch (notFoundInDatabase ex) {
            System.out.println("This conference was not found in database.");
            conference = readConference();
        }
        
        return conference;
    }

    public int readNumberOfReviewers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of reviewers:");
        int readValue;
        try{
            readValue = scanner.nextInt();
            isValidReadNumberOfReviewers(readValue);
        }
        catch(InputMismatchException e){
            System.out.println("No integer found.");
            readValue = readNumberOfReviewers();
        }
        catch (InvalidNumberOfReviewersException e) {
            System.out.println("Invalid number of reviewers.");
            readValue = readNumberOfReviewers();
        }
        return readValue;
    }
    
    public Article readArticleId() {
        Database db = Database.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the article id:");
        int readValue;
        Article article;
        try{
            readValue = scanner.nextInt();
            article = db.readArticle(readValue);
            isArticleUnreviewed(article);
        }
        catch(InputMismatchException e){
            System.out.println("No integer found.");
            article = readArticleId();
        }
        catch (InvalidArticleException e) {
            System.out.println("Invalid article ID.");
            article = readArticleId();
        }
        catch (notFoundInDatabase ex) {
            System.out.println("There is no articles with the informed ID.");
            article = readArticleId();
        }
        return article;
    }
    
    public int readResearcherId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of reviewers:");
        int readValue;
        try{
            readValue = scanner.nextInt();
            isValidReadNumberOfReviewers(readValue);
        }
        catch(InputMismatchException e){
            System.out.println("No integer found.");
            readValue = readNumberOfReviewers();
        }
        catch (InvalidNumberOfReviewersException e) {
            System.out.println("Invalid number of reviewers.");
            readValue = readNumberOfReviewers();
        }
        return readValue;
    }

    public float readFloat() throws InvalidGradeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade for this article:");
        float readValue;
        try{
            readValue = scanner.nextInt();
            boolean test = (readValue <= MAX_GRADE && readValue >=MIN_GRADE);
            if(!test){
                throw new InvalidGradeException();
            }
        }
        catch(InputMismatchException e){
            System.out.println("No float found.");
            readValue = readFloat();
        }
        return readValue;
    }

    public void showUI() {
        System.out.println("Choose:\n1 - Allocate Conference.\n2 - Rate Article.\n3 - Select Article.\n0 - Exit program.");
    }

    public void showArticlesList() {
        Database db = Database.getInstance();
        ArrayList<Article> articles = db.getArticles();
        System.out.println("Select unrated articles by ID:");
        for(Article artic : articles){
            if(!artic.isGraded()){
                System.out.println("Article title: " + artic.getTitle() + "\nID: " + artic.getID());
            }
        }
    }

    public void showArticleReviewersList(Article article) {
        if (article.getReviewers().isEmpty()){
            System.out.println("There is no reviewers assigned for this article.");
        }
        else{
            System.out.println("Reviewers of " + article.getTitle() + ":");
            for(Researcher reviewer : article.getReviewers()){
                System.out.println(reviewer.getName());
            }            
        }

    }

    public void showConferences() {
        Database db = Database.getInstance();
        ArrayList<Conference> conferences = db.getConferences();
        System.out.println("Conferences:");
        for(Conference conf : conferences){
            if((conf.getArticlesAllocated().isEmpty()))
                System.out.println(conf.getInitials());
        }
    }

    public void showArticlesWithGrades(ArrayList<Article> articlesList) {
        for(Article article : articlesList){
            System.out.println("ID: " + article.getID() + " Article: " + article.getTitle() + "\nAuthor: " + article.getAuthor().getName() + "\nGrade: " + article.meanGrade());
        }
    }
    
    private void isValidUiInput(int input) throws NotMenuOptionException{
        if(input > NUMBER_OF_OPTIONS || input < 0){
            throw new NotMenuOptionException();
        }
    }
    
    private void isValidReadNumberOfReviewers(int readValue) throws InvalidNumberOfReviewersException{
             if(readValue > MAX_NUMREVIEWERS || readValue < MIN_NUMREVIEWERS){
                 throw new InvalidNumberOfReviewersException();
             }
    }
    
    private void isArticleUnreviewed(Article readArticle) throws InvalidArticleException{
             if(readArticle.isGraded()){
                 throw new InvalidArticleException();
             }
    }


}
