package RLObjects;

import java.util.*;
import Service.Database;

public class Conference {
    
    public String initials;
    public ArrayList<Article> articlesSubmitted;
    public ArrayList<Article> articlesAllocated;
    public ArrayList<Researcher> committeeMembers;
    public Researcher coordinator;
    
    /**
     * Default constructor
     */
    public Conference() {
    }

    /**
     * @return
     */
    public int getLowestSubmittedArticleID() {
        private Database db;
        private ArrayList<Article> articles = db.getArticles();
        
        return 0;
    }

    /**
     * @param article 
     * @return
     */
    public ArrayList<Researcher> getCandidateReviewers(Article article) {
        // TODO implement here
        return null;
    }

    /**
     * @param researchCandidatesList 
     * @return
     */
    public ArrayList<Researcher> sortReviewers(ArrayList<Researcher> researchCandidatesList) {
        // TODO implement here
        return null;
    }

    /**
     * @param lowestIdSubmittedArticle 
     * @param firstSortedResearcher 
     * @return
     */
    public Article allocateArticle(Article lowestIdSubmittedArticle, Researcher firstSortedResearcher) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Article> getAcceptedArticles() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Article> getRejectedArticles() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Researcher getCoordinator() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public boolean hasUnreviewedArticles() {
        // TODO implement here
        return true;
    }

}