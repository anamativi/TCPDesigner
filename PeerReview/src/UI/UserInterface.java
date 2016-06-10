package UI;


import Service.Service;
import RLObjects.Article;
import Service.Database;
import java.util.*;
import java.util.Scanner;

public class UserInterface {

    public Service service;

    public UserInterface() {
    }

    public void UserInterface(Service service) {
        // TODO implement here
        //return null;
    }

    public void getCommand() {
        Scanner scanner = new Scanner(System.in);
        
        int loop = 1;
        System.out.println("Choose:\n1 - Allocate Conference.\n2 - Rate Article.\n3 - Select Article.\n0 - Exit program.");
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
        int valorLido;
        try{
            valorLido = scanner.nextInt();
            boolean test = (valorLido <= 5 && valorLido >=3);
            if(!test){
                throw new InvalidNumberOfReviewersException();
            }
        }
        catch(InputMismatchException e){
            System.out.println("No integer found.");
            valorLido = readInteger();
        }
        return valorLido;
    }

    public float readFloat() {
        // TODO implement here
        return 0.0f;
    }

    public void showUI() {
        // TODO implement here
        //return null;
    }

    public void showArticlesList() {
        // TODO implement here
        //return null;
    }

    public void showArticleReviewersList(Article article) {
        // TODO implement here
        //return null;
    }

    public void showConferences() {
        // TODO implement here
        //return null;
    }

    public void showArticlesWithGrades(ArrayList<Article> articlesList) {
        // TODO implement here
        //return null;
    }

}