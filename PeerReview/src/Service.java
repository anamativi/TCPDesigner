
import java.util.*;

/**
 * 
 */
public class Service {

    /**
     * Default constructor
     */
    public Service() {
    }

    /**
     * 
     */
    public Database db;



    /**
     * @param db
     */
    public void Service(Database db) {
        // TODO implement here
    }

    /**
     * @param conference 
     * @param numReviewers 
     * @param ui 
     * @return
     */
    public void allocArticlesToMembers(Conference conference, int numReviewers, UserInterface ui) {
        // TODO implement here
        return null;
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