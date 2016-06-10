package UI;


import RLObjects.Conference;
import Service.Service;
import Service.notFoundInDatabase;
import UI.Command;
import java.util.*;

/**
 * 
 */
public class SelectArticleCommand extends Command {


    public SelectArticleCommand() {
    }

    @Override
    public void execute() {
        Service service = new Service();
        UserInterface uInterface = new UserInterface();
        uInterface.showAllocatedConferences();
        Conference conference = uInterface.readConference();
         
        service.selectArticle(conference, uInterface);
        
    }


}