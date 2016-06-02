package Service;

import RLObjects.ResearchTopic;
import RLObjects.University;
import RLObjects.Researcher;
import RLObjects.Conference;
import RLObjects.Article;
import java.util.*;

public class Database {

    public ArrayList<Researcher> researchers;
    public ArrayList<Conference> conferences;
    public ArrayList<Article> articles;
    public ArrayList<University> universities;
    public ArrayList<ResearchTopic> reasearchTopics;

    /**
     * Default constructor
     */
    public Database() {
    }

    /**
     * @return
     */
    public void initData() {
        // TODO implement here
        //return null;
    }

    /**
     * @return
     */
    public ArrayList<Researcher> getResearchers() {
        return this.researchers;
    }

    /**
     * @return
     */
    public ArrayList<Conference> getConferences() {
        return this.conferences;
    }

    /**
     * @return
     */
    public ArrayList<Article> getArticles() {
        return this.articles;
    }

    /**
     * @return
     */
    public ArrayList<University> getUniversities() {
        return this.universities;
    }

    /**
     * @return
     */
    public ArrayList<ResearchTopic> getResearchTopics() {
        return this.reasearchTopics;
    }

    /**
     * @param researcher 
     * @return
     */
    public void addResearcher(Researcher researcher) {
        // TODO implement here
        //return null;
    }

    /**
     * @param conference 
     * @return
     */
    public void addConference(Conference conference) {
        // TODO implement here
        //return null;
    }

    /**
     * @param article 
     * @return
     */
    public void addArticle(Article article) {
        // TODO implement here
        //return null;
    }

    /**
     * @param university 
     * @return
     */
    public void addUniversity(University university) {
        // TODO implement here
        //return null;
    }

    /**
     * @param researchTopic 
     * @return
     */
    public void addResearchTopic(ResearchTopic researchTopic) {
        // TODO implement here
        //return null;
    }

}