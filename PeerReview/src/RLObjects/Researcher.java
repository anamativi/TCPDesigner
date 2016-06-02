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

    /**
     * @return
     */
    public ArrayList<ResearchTopic> getResearchTopics() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public University getUniversity() {
        return this.affiliation;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return this.name;
    }

    /**
     * @return
     */
    public int getID() {
        // TODO implement here
        return 0;
    }

    /**
     * @param article 
     * @return
     */
    public void allocateArticle(Article article) {
        // TODO implement here
        //return null;
    }

}