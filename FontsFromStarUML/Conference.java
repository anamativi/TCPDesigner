
import java.util.*;

/**
 * 
 */
public class Conference {

    /**
     * Default constructor
     */
    public Conference() {
    }

    /**
     * 
     */
    public string initials;

    /**
     * 
     */
    public arrayList<Article> articlesSubmitted;

    /**
     * 
     */
    public arrayList<Article> articlesAllocated;

    /**
     * 
     */
    public arrayList<Researcher> committeeMembers;

    /**
     * 
     */
    public Researcher coordinator;









    /**
     * @return
     */
    public int getLowestSubmittedArticleID() {
        // TODO implement here
        return 0;
    }

    /**
     * @param article 
     * @return
     */
    public arrayList<Researcher> getCandidateReviewers(Article article) {
        // TODO implement here
        return null;
    }

    /**
     * @param researchCandidatesList 
     * @return
     */
    public arrayList<Researcher> sortReviewers(arrayList<Researcher> researchCandidatesList) {
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
    public arrayList<Article> getAcceptedArticles() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public arrayList<Article> getRejectedArticles() {
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
    public bool hasUnreviewedArticles() {
        // TODO implement here
        return null;
    }

}