package RLObjects;
import java.util.*;

public class Article implements Comparable<Article>{
    
    private int id;
    private String title;
    private Researcher author;
    private ArrayList<Researcher> reviewers;
    private Conference conference;
    private ResearchTopic researchTopic;
    private HashMap<Researcher,Float> grades;
    private final float MIN_ACCEPTED_GRADE=0;
    
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

    
     public boolean isGraded() {
        return (grades.size() == numberOfReviewers());
    }


    public void allocateReviewer(Researcher reviewer) {
        reviewers.add(reviewer);
    }


    public void setGrade(Researcher reviewer, float grade) {
        grades.put(reviewer,grade);
    }
    
    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }
    
    public boolean wasAccepted(){

        if(meanGrade() < MIN_ACCEPTED_GRADE) return false;
        else return true;
    }
    
    private float meanGrade(){
        float meanGrade=0;
        for(int i=0;i<reviewers.size();i++){
            meanGrade = meanGrade + grades.get(reviewers.get(i));
        }
        meanGrade = meanGrade/reviewers.size();
        return meanGrade;
    }

}
