package UI;


import Service.Service;
import RLObjects.*;
import Service.Database;
import java.util.*;
import java.util.Scanner;


public class UserInterface {

    public Service service;
    private final static float MIN_GRADE=-3;
    private final static float MAX_GRADE=3;
    private final static float MIN_NUMREVIEWERS=3;
    private final static float MAX_NUMREVIEWERS=5;

    public UserInterface() {
    }

    public void UserInterface(Service service) {
        // TODO implement here
        //return null;
    }

    public void getCommand() {
        
        int loop = 1;
        while(loop != 0){
            try{
            loop = new Scanner(System.in).nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Incorrect input type, must be integer. Enter Again.");
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

    public String readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter conference:");
        return scanner.nextLine();
    }

    public int readInteger() throws InvalidNumberOfReviewersException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of reviewers:");
        int readValue;
        try{
            readValue = scanner.nextInt();
            boolean test = (readValue <= MAX_NUMREVIEWERS && readValue >=MIN_NUMREVIEWERS);
            if(!test){
                throw new InvalidNumberOfReviewersException();
            }
        }
        catch(InputMismatchException e){
            System.out.println("No integer found.");
            readValue = readInteger();
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
            System.out.println("No integer found.");
            readValue = readFloat();
        }
        return readValue;
    }

    public void showUI() {
        System.out.println("Choose:\n1 - Allocate Conference.\n2 - Rate Article.\n3 - Select Article.\n0 - Exit program.");
    }

    public void showArticlesList() {

    }

    public void showArticleReviewersList(Article article) {
        // TODO implement here
        //return null;
    }

    public void showConferences() {
        Database db = Database.getInstance();
        ArrayList<Conference> conferences = db.getConferences();
        System.out.println("Conferences:");
        for(Conference conf : conferences){
            if(!(conf.getArticlesAllocated().isEmpty()))
                System.out.println(conf.getInitials());
        }
    }

    public void showArticlesWithGrades(ArrayList<Article> articlesList) {
        for(Article article : articlesList){
            System.out.println("ID: " + article.getID() + " Article: " + article.getTitle() + "\nAuthor: " + article.getAuthor().getName() + "\nGrade: " + article.getMeanGrade());
        }
    }

}