package Service;

import Service.Database;
import UI.UserInterface;
import java.util.*;

public class PeerReview {
    
    /**
     * Default constructor
     */
    public PeerReview() {
    }

    public static void main(String[] args) {
        Database db = Database.getInstance();
        UserInterface programInterface = new UserInterface();
        programInterface.showUI();
        programInterface.getCommand();
    }

}
