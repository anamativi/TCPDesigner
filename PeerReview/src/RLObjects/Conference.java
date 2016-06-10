package RLObjects;
import java.util.*;

import java.util.*;
import Service.Database;

public class Conference {
    
    private String initials;
    private ArrayList<Article> articlesSubmitted;
    private ArrayList<Article> articlesAllocated;
    private ArrayList<Researcher> committeeMembers;
    

    public Conference() {
    }
    
    public Conference(String initials, ArrayList<Researcher> committeeMembers) {
        this.initials = initials;
        this.committeeMembers = committeeMembers;
        this.articlesAllocated = new ArrayList<>();
        this.articlesSubmitted = new ArrayList<>();
    }


    public Article getLowestIDSubmittedArticle() {
        Collections.sort(this.articlesSubmitted);
        return articlesSubmitted.get(0);
    }

    /**
     * @param article 
     * @return
     */
    public ArrayList<Researcher> getCandidateReviewers(Article article) {
        if (!(article.getAuthor().equals(this.committeeMembers.get(0)))){
            if (this.committeeMembers.get(0).getResearchTopics().contains(article.getResearchTopic())){
                if (!(article.getReviewers().contains(this.committeeMembers.get(0)))){
                    //keep going --> ordena candidatos
                }
            }
    }
        return null;
    }

    /**
     * @param researchCandidatesList 
     * @return
     */
    public ArrayList<Researcher> sortReviewers(ArrayList<Researcher> researchCandidatesList) {
        Collections.sort(researchCandidatesList);
        return researchCandidatesList;
    }


    public Article allocateArticle(Article lowestIdSubmittedArticle, Researcher firstSortedResearcher) {
        articlesSubmitted.remove(lowestIdSubmittedArticle);
        articlesAllocated.add(lowestIdSubmittedArticle);
        firstSortedResearcher.allocateArticle(lowestIdSubmittedArticle);
        lowestIdSubmittedArticle.allocateReviewer(firstSortedResearcher);
        return null;
    }


    public ArrayList<Article> getAcceptedArticles() {
        ArrayList<Article> acceptedArticles = new ArrayList<Article>();
        for(int i=0;i<articlesAllocated.size();i++){
            if(articlesAllocated.get(i).wasAccepted()){
                acceptedArticles.add(articlesAllocated.get(i));
            }
        }
        return acceptedArticles;
    }


    public ArrayList<Article> getRejectedArticles() {
        ArrayList<Article> rejectedArticles = new ArrayList<Article>();
        for(int i=0;i<articlesAllocated.size();i++){
            if(!articlesAllocated.get(i).wasAccepted()){
                rejectedArticles.add(articlesAllocated.get(i));
            }
        }
        return rejectedArticles;
    }

    
    public boolean hasUnreviewedArticles() {
        for(int i=0;i < articlesAllocated.size();i++){
            if(articlesAllocated.get(i).isGraded())
                return true;
        }
        return false;
    }
    
    public ArrayList<Article> getArticlesSubmitted() {
        return articlesSubmitted;
    }
    
    public boolean hasArticlesNotAllocated() {
        if (articlesSubmitted.size() > 0) return true;
        else return false;
    }

    public ArrayList<Article> getArticlesAllocated() {
        return articlesAllocated;
    }
    
    public String getInitials(){
        return initials;
    }
    
    
    

}
