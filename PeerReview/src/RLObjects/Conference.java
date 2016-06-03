package RLObjects;
import java.util.*;

import java.util.*;
import Service.Database;

public class Conference {
    
    private String initials;
    private ArrayList<Article> articlesSubmitted;
    private ArrayList<Article> articlesAllocated;
    private ArrayList<Researcher> committeeMembers;
    //public Researcher coordinator; //Why do this even exists? It shalt be deleted
    
    /**
     * Default constructor
     */
    public Conference() {
    }
    
    public Conference(String initials, ArrayList<Researcher> committeMembers) {
        this.initials = initials;
        this.committeeMembers = committeeMembers;
        this.articlesAllocated = new ArrayList<>();
        this.articlesSubmitted = new ArrayList<>();
    }

    /**
     * @return
     */
    public int getLowestSubmittedArticleID() {
        Database db = Database.getInstance();
        articlesSubmitted = db.getArticles();
        
        Collections.sort(articlesSubmitted);
        
        return articlesSubmitted.get(0).getID();
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
    
    public boolean hasUnreviewedArticles() {
        for(int i=0;i < articlesAllocated.size();i++){
            if(articlesAllocated.get(i).numberOfGrades() < articlesAllocated.get(i).numberOfReviewers())
                return true;
        }
        return false;
    }
    
    public ArrayList<Article> getArticlesSubmitted() {
        return articlesSubmitted;
    }

    public ArrayList<Article> getArticlesAllocated() {
        return articlesAllocated;
    }
    
    
    

}
