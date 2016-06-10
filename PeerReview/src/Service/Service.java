package Service;

import UI.UserInterface;
import RLObjects.Researcher;
import RLObjects.Conference;
import RLObjects.Article;
import java.util.*;

public class Service {

    public Service() {
    }

    public void Service() {
    }


    public void allocArticlesToMembers(Conference conference, int numReviewers, UserInterface ui) {
    Database db = Database.getInstance();
        try{
            db.searchConference(conference);
        }catch(notFoundInDatabase e){
        System.out.println(e.toString());
        }
        ui.showMessage("Iniciando alocação");
        
        
            
        
        for(int i=0;i<numReviewers;i++){
            while(conference.hasArticlesNotAllocated()){
                Article lowestID = conference.getLowestIDSubmittedArticle();
                ArrayList<Researcher> eligibleReviewerList = conference.getCandidateReviewers(lowestID);
                eligibleReviewerList = conference.sortReviewers(eligibleReviewerList);
                conference.allocateArticle(lowestID, eligibleReviewerList.get(0));
            }
           }
        }

        
    
    /**
     * @param article 
     * @param reviewer 
     * @param rate 
     * @param ui
     */
    public void rateArticle(Article article, Researcher reviewer, float rate, UserInterface ui) {
        // TODO implement here                                                    
    }

    /**
     * @param conference 
     * @param ui
     */
    public void selectArticle(Conference conference, UserInterface ui) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Conference readConference() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Researcher readResearcher() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Article readArticle() {
        // TODO implement here
        return null;
    }

}