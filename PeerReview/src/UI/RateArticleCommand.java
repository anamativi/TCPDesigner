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
        Article article = uInterface.readArticleId();

        uInterface.showArticleReviewersList(article);
        Researcher reviewer = uInterface.readResearcherId(article);
       

        float grade = uInterface.readGrade(); 

        service.rateArticle(article, reviewer, grade, uInterface);
        
    }

}