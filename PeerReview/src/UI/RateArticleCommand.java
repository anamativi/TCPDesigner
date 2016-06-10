package UI;


import Service.Service;
import RLObjects.Article;
import RLObjects.Researcher;
import Service.notFoundInDatabase;
import UI.Command;
import java.util.*;


public class RateArticleCommand extends Command {


    public RateArticleCommand() {
    }


    public void execute() {
        UserInterface uInterface = new UserInterface();
        Service service = new Service();
        Article article = null;
        Researcher reviewer=null;
        int articleID = 0, researcherID = 0;
        float grade=0;
        
        uInterface.showArticlesList();
        try{
           articleID = uInterface.readInteger(); 
           article = service.readArticle(articleID);
        }catch(InvalidNumberOfReviewersException | notFoundInDatabase e){
            System.out.println(e.toString());
        }
        
        
        uInterface.showArticleReviewersList(article);
        try{
           researcherID = uInterface.readInteger(); 
           reviewer = service.readResearcher(researcherID);
        }catch(InvalidNumberOfReviewersException | notFoundInDatabase e){
            System.out.println(e.toString());
        }
       
        try{
            grade = uInterface.readFloat(); 
        }catch(InvalidGradeException e){
            System.out.println(e.toString());
        }
        
 
        service.rateArticle(article, reviewer, grade, uInterface);
        
    }

}