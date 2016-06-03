package RLObjects;

import java.util.*;

public class Researcher {

    private int id;
    private String name;
    private University affiliation;
    private ArrayList<ResearchTopic> researchTopic;
    private ArrayList<Article> allocatedArticles;
    
    /**
     * Default constructor
     */
    public Researcher() {
    }
    
    public Researcher(int id, String name, University affiliation, ArrayList<ResearchTopic> researchTopic) {
        this.id = id;
        this.name = name;
        this.affiliation = affiliation;
        this.researchTopic = researchTopic;
        this.allocatedArticles = new ArrayList<>();
    }


    public ArrayList<ResearchTopic> getResearchTopics() {
        return this.researchTopic;
    }

 
    public University getUniversity() {
        
        //teste commit
        return this.affiliation;
    }


    public String getName() {
        return this.name;
    }

 
    public int getID() {
        return this.id;
    }


    public void allocateArticle(Article article) {
        this.allocatedArticles.add(article);
    }

}