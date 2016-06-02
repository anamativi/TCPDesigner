package RLObjects;
import java.util.*;

public class Article {
    
    private int id;
    private String title;
    private Researcher author;
    private ArrayList<Researcher> reviewers;
    private Conference conference;
    private ResearchTopic researchTopic;
    private HashMap<Researcher,Grade> grades;
    
    public Article() {
    }
    
    public Article(int id, String title, Researcher author, Conference conference, ResearchTopic researchTopic) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.conference = conference;
        this.researchTopic = researchTopic;
        
        this.reviewers = new ArrayList<>();
        this.grades = new HashMap<>();
    }
    
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
    public boolean isResearcherAllocated(Researcher researcher) {
        // TODO implement here
        return false;
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
        //return null;
    }

    /**
     * @param reviewer 
     * @param grade 
     * @return
     */
    public void setGrade(Researcher reviewer, float grade) {
        // TODO implement here
        //return null;
    }

}