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
  
        uInterface.showArticlesList();
        int articleID = uInterface.readNumberOfReviewers(); 
        Article article = service.readArticle(articleID);
  
        
        
        uInterface.showArticleReviewersList(article);
        int researcherID = uInterface.readNumberOfReviewers(); 
        Researcher reviewer = service.readResearcher(researcherID);
       

        float grade = uInterface.readGrade(); 

        service.rateArticle(article, reviewer, grade, uInterface);
        
    }

}