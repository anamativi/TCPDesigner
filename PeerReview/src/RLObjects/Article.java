package RLObjects;


import java.util.*;

/**
 * 
 */
public class Article {

    /**
     * Default constructor
     */
    public Article() {
    }

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    public string title;

    /**
     * 
     */
    public Researcher author;

    /**
     * 
     */
    public arrayList<Researcher> reviewers;

    /**
     * 
     */
    public Conference conference;

    /**
     * 
     */
    public ResearchTopic researchTopic;

    /**
     * 
     */
    public Map<Researcher, float> grades;






    /**
     * @return
     */
    public University getAuthorUniversity() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ResearchTopic getResearchTopic() {
        // TODO implement here
        return null;
    }

    /**
     * @param researcher 
     * @return
     */
    public bool isResearcherAllocated(Researcher researcher) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int getID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int numberOfReviewers() {
        // TODO implement here
        return 0;
    }

    /**
     * @param reviewer 
     * @return
     */
    public void allocateReviewer(Researcher reviewer) {
        // TODO implement here
        return null;
    }

    /**
     * @param reviewer 
     * @param grade 
     * @return
     */
    public void setGrade(Researcher reviewer, float grade) {
        // TODO implement here
        return null;
    }

}