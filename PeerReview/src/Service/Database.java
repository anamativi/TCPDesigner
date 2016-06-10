package Service;

import RLObjects.ResearchTopic;
import RLObjects.Researcher;
import RLObjects.Conference;
import RLObjects.Article;
import java.util.*;

public class Database {

    private ArrayList<Researcher> researchers;
    private ArrayList<Conference> conferences;
    private ArrayList<Article> articles;
    private ArrayList<String> universities;
    private ArrayList<ResearchTopic> researchTopics;
    
    private static Database db = new Database();
    
    /**
     * Default constructor
     */
    public Database() {
        this.researchers = new ArrayList<>();
        this.conferences = new ArrayList<>();
        this.articles = new ArrayList<>();
        this.universities = new ArrayList<>();
        this.researchTopics = new ArrayList<>();        
        this.initData();
    }

    public static Database getInstance(){
        return db;
    }
    
    /**
     */
    public final void initData() {
            
            ResearchTopic softwareProductLines = new ResearchTopic("Software Product Lines");
            ResearchTopic softwareReuse = new ResearchTopic("Software Reuse");
            ResearchTopic modularity = new ResearchTopic("Modularity");
            ResearchTopic softwareArchitecture = new ResearchTopic("Software Architecture");
            ResearchTopic softwareTesting = new ResearchTopic("Software Testing");
            ResearchTopic aspectOrientedProgramming = new ResearchTopic("Aspect-oriented Programming");
            ResearchTopic softwareQuality = new ResearchTopic("Software Quality");
            
            ArrayList<ResearchTopic> joaoTopics = new ArrayList<>();
            joaoTopics.add(softwareProductLines);
            joaoTopics.add(softwareReuse);
            joaoTopics.add(modularity);
            ArrayList<ResearchTopic> anaTopics = new ArrayList<>();
            anaTopics.add(softwareArchitecture);
            anaTopics.add(modularity);
            anaTopics.add(softwareReuse);
            ArrayList<ResearchTopic> manoelTopics = new ArrayList<>();
            manoelTopics.add(softwareProductLines);
            manoelTopics.add(softwareTesting);
            ArrayList<ResearchTopic> joanaTopics = new ArrayList<>();
            joanaTopics.add(softwareProductLines);
            joanaTopics.add(softwareReuse);            
            joanaTopics.add(softwareArchitecture);
            joanaTopics.add(aspectOrientedProgramming);            
            ArrayList<ResearchTopic> miguelTopics = new ArrayList<>();
            miguelTopics.add(softwareArchitecture);
            miguelTopics.add(modularity);
            miguelTopics.add(softwareTesting);
            ArrayList<ResearchTopic> beatrizTopics = new ArrayList<>();
            beatrizTopics.add(softwareReuse);
            beatrizTopics.add(softwareTesting);
            beatrizTopics.add(aspectOrientedProgramming);
            ArrayList<ResearchTopic> suzanaTopics = new ArrayList<>();
            suzanaTopics.add(aspectOrientedProgramming);
            suzanaTopics.add(modularity);
            suzanaTopics.add(softwareReuse);
            ArrayList<ResearchTopic> natashaTopics = new ArrayList<>();
            natashaTopics.add(modularity);
            natashaTopics.add(softwareReuse);            
            natashaTopics.add(softwareQuality);
            natashaTopics.add(softwareProductLines);          
            ArrayList<ResearchTopic> pedroTopics = new ArrayList<>();
            pedroTopics.add(aspectOrientedProgramming);
            pedroTopics.add(softwareArchitecture);
            ArrayList<ResearchTopic> carlosTopics = new ArrayList<>();
            carlosTopics.add(softwareReuse);
            carlosTopics.add(modularity);
            carlosTopics.add(softwareTesting);
            
            Researcher joao = new Researcher(1, "João", "UFRGS", joaoTopics);
            Researcher ana = new Researcher(2, "Ana", "USP", anaTopics);
            Researcher manoel = new Researcher(3, "Manoel", "UFRGS", manoelTopics);
            Researcher joana = new Researcher(4, "Joana", "UFRJ", joanaTopics);
            Researcher miguel = new Researcher(5, "Miguel", "UFRGS", miguelTopics);
            Researcher beatriz = new Researcher(6, "Beatriz", "UFRJ", beatrizTopics);
            Researcher suzana = new Researcher(7, "Suzana", "UFRGS", suzanaTopics);
            Researcher natasha = new Researcher(8, "Natasha", "UFRJ", natashaTopics);
            Researcher pedro = new Researcher(9, "Pedro", "USP", pedroTopics);
            Researcher carlos = new Researcher(10, "Carlos", "USP", carlosTopics);
            
            ArrayList<Researcher> icseResearchers = new ArrayList<>();
            icseResearchers.add(joao);
            icseResearchers.add(ana);
            icseResearchers.add(manoel);
            icseResearchers.add(joana);
            icseResearchers.add(miguel);
            icseResearchers.add(beatriz);
            icseResearchers.add(suzana);
            ArrayList<Researcher> fseResearchers = new ArrayList<>();
            fseResearchers.add(joao);
            fseResearchers.add(ana);
            fseResearchers.add(manoel);
            fseResearchers.add(joana);
            fseResearchers.add(miguel);
            fseResearchers.add(beatriz);
            fseResearchers.add(suzana);
            ArrayList<Researcher> sbesResearchers = new ArrayList<>();
            sbesResearchers.add(joana);
            sbesResearchers.add(miguel);
            sbesResearchers.add(beatriz);
            sbesResearchers.add(suzana);
            sbesResearchers.add(natasha);
            sbesResearchers.add(pedro);
            sbesResearchers.add(carlos);
            
            Conference icse = new Conference("ICSE", icseResearchers);
            Conference fse = new Conference("FSE", fseResearchers);
            Conference sbes = new Conference("SBES", sbesResearchers);
            
            Article article1 = new Article(1, "Coupling and Cohesioin", joao, sbes, modularity);
            Article article2 = new Article(2, "Design Patterns", beatriz, fse, softwareReuse);
            Article article3 = new Article(3, "AspectJ", suzana, fse, aspectOrientedProgramming);
            Article article4 = new Article(4,"Feature Model", natasha,fse,softwareProductLines);
            Article article5 = new Article(5,"Architecture Recovery",pedro,fse,softwareArchitecture);
            Article article6 = new Article(6,"Funcional Testing",carlos,fse,softwareTesting);
            Article article7 = new Article(7,"COTs",beatriz,icse,softwareReuse);
            Article article8 = new Article(8,"Pointcut",suzana,icse,aspectOrientedProgramming);
            Article article9 = new Article(9,"Product Derivation",natasha,icse,softwareProductLines);
            Article article10 = new Article(10,"Architecture Comformance",pedro,icse,softwareArchitecture);
            Article article11 = new Article(11,"Structural Testing",carlos,icse,softwareTesting);
            
            this.addUniversity("UFRGS");
            this.addUniversity("UFRJ");           
            this.addUniversity("USP");    
            
            this.addResearchTopic(aspectOrientedProgramming);
            this.addResearchTopic(modularity);
            this.addResearchTopic(softwareArchitecture);
            this.addResearchTopic(softwareProductLines);
            this.addResearchTopic(softwareQuality);
            this.addResearchTopic(softwareReuse);
            this.addResearchTopic(softwareTesting);
            
            this.addResearcher(joao);
            this.addResearcher(ana);
            this.addResearcher(manoel);
            this.addResearcher(joana);
            this.addResearcher(miguel);
            this.addResearcher(beatriz);
            this.addResearcher(suzana);
            this.addResearcher(natasha);
            this.addResearcher(pedro);
            this.addResearcher(carlos);
            
            this.addConference(icse);
            this.addConference(fse);
            this.addConference(sbes);
            
            this.addArticle(article1);
            this.addArticle(article2);
            this.addArticle(article3);
            this.addArticle(article4);
            this.addArticle(article5);
            this.addArticle(article6);
            this.addArticle(article7);
            this.addArticle(article8);
            this.addArticle(article9);
            this.addArticle(article10);
            this.addArticle(article11);
            
            for(Article a : this.articles){
                a.getConference().getArticlesSubmitted().add(a);
            }
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
    public ArrayList<String> getUniversities() {
        return this.universities;
    }

    /**
     * @return
     */
    public ArrayList<ResearchTopic> getResearchTopics() {
        return this.researchTopics;
    }

    /**
     * @param researcher 
     */
    public void addResearcher(Researcher researcher) {
        this.researchers.add(researcher);
    }

    /**
     * @param conference 
     * @return
     */
    public void addConference(Conference conference) {
        this.conferences.add(conference);
    }

    /**
     * @param article 
     * @return
     */
    public void addArticle(Article article) {
        this.articles.add(article);
    }

    /**
     * @param university 
     */
    public void addUniversity(String university) {
        this.universities.add(university);
    }

    /**
     * @param researchTopic
     */
    public void addResearchTopic(ResearchTopic researchTopic) {
        this.researchTopics.add(researchTopic);
    }
    
    
    public Conference searchConference(Conference conference) throws notFoundInDatabase{
        for(int i=0;i<conferences.size();i++){
            if(conferences.get(i).getInitials().equals(conference.getInitials()))
                return conferences.get(i);
        }
        throw new notFoundInDatabase("Conference not found.");
    }
    
    
    

}