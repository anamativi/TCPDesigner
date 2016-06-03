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
    
    public class CompareArticleIDs implements Comparator<Article> {
    @Override
    public int compare(Article o1, Article o2) {
        return o1.getID().compareTo(o2.getID());
    }
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
        return researchTopic;
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
        return id;
    }

    /**
     * @return
     */
    public int numberOfReviewers() {
        // TODO implement here
        int nrReviewers = 1;
        for(int i=0;i<reviewers.size();i++){
            nrReviewers++;
    }
        return nrReviewers;
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