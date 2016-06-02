package RLObjects;

import java.util.*;

public class Researcher {

    public int id;
    public String name;
    public University affiliation;
    public ArrayList<ResearchTopic> researchTopic;
    public ArrayList<Article> allocatedArticles;
    
    /**
     * Default constructor
     */
    public Researcher() {
    }


    public ArrayList<ResearchTopic> getResearchTopics() {
        return this.researchTopic;
    }

 
    public University getUniversity() {
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