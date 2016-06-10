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


    public void allocArticlesToMembers(Conference conference, int numReviews, UserInterface ui) {
    
        try{
            readConference(conference.getInitials());
        }catch(notFoundInDatabase e){
        System.out.println(e.toString());
        }
        ui.showMessage("Iniciando alocação");
        
        for(int reviewTimes=1;reviewTimes <= numReviews;reviewTimes++){
            while(conference.hasArticlesNotAllocated()){
                Article lowestID = conference.getLowestIDSubmittedArticle();
                ArrayList<Researcher> eligibleReviewerList = conference.getCandidateReviewers(lowestID);
                eligibleReviewerList = conference.sortReviewers(eligibleReviewerList);
                conference.allocateArticle(lowestID, eligibleReviewerList.get(0));
            }
            if(reviewTimes != numReviews) conference.switchList();
        }
    }

        
    

    public void rateArticle(Article article, Researcher reviewer, float rate, UserInterface ui) {
        article.setGrade(reviewer, rate);                                                    
    }


    public void selectArticle(Conference conference, UserInterface ui) {
        if(conference.hasUnreviewedArticles()) ui.showMessage("Alerta: Há artigos que não foram revisados.");
        else{
            ui.showArticlesWithGrades(conference.getAcceptedArticles());
            ui.showArticlesWithGrades(conference.getRejectedArticles());
        }
    }


    public Conference readConference(String conferenceInitials) throws notFoundInDatabase{
        Database db = Database.getInstance();
        ArrayList<Conference> conferences = db.getConferences();
        for(int i=0;i<conferences.size();i++){
            if(conferences.get(i).getInitials().equals(conferenceInitials))
                return conferences.get(i);
        }
        throw new notFoundInDatabase("Conference not found.");
    }


    public Article readArticle(int ID) throws notFoundInDatabase{
        Database db = Database.getInstance();
        ArrayList<Article> articles = db.getArticles();
        for(int i=0;i<articles.size();i++){
            if(articles.get(i).getID() == ID)
                return articles.get(i);
        }
        throw new notFoundInDatabase("Article not found.");
    }

    public Researcher readResearcher(int ID) throws notFoundInDatabase{
        Database db = Database.getInstance();
        ArrayList<Researcher> researcher = db.getResearchers();
        for(int i=0;i<researcher.size();i++){
            if(researcher.get(i).getID() == ID)
                return researcher.get(i);
        }
        throw new notFoundInDatabase("Researcher not found.");
    }

}