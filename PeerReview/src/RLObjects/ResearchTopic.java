package RLObjects;

import java.util.*;

public class ResearchTopic {
    
    public String name;
    
    /**
     * Default constructor
     */

    public ResearchTopic(String name) {
        this.name = name;
    }



    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

}