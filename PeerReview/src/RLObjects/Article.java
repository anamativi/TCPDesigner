package RLObjects;
import java.util.*;

public class Article implements Comparable<Article>{
    
    private int id;
    private String title;
    private Researcher author;
    private ArrayList<Researcher> reviewers;
    private Conference conference;
    private ResearchTopic researchTopic;
    private HashMap<Researcher,Grade> grades;
    
    public Article() {
    }
    
    @Override
    public int compareTo(Article compareArticle) {
        int compareID=((Article)compareArticle).getID();
        return this.id-compareID;
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
    

    public University getAuthorUniversity() {
        return author.getUniversity();
    }

 
    public ResearchTopic getResearchTopic() {
        return researchTopic;
    }


    public boolean isResearcherAllocated(Researcher researcher) {
        for(int i=0;i<reviewers.size();i++){
            if(reviewers.get(i).getID() == researcher.getID()){
                return true;
            }
        }
        return false;
    }

 
    public int getID() {
        return this.id;
    }

    public int numberOfReviewers() {
        return reviewers.size();
    }

    
     public int numberOfGrades() {
        return grades.size();
    }


    public void allocateReviewer(Researcher reviewer) {
        reviewers.add(reviewer);
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
    
    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

}
