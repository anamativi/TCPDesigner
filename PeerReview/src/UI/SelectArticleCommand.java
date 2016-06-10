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
        Conference conference=null;
        UserInterface uInterface = new UserInterface();
        uInterface.showConferences();
        String conferenceName = uInterface.readString();
        
         try{
            conference = service.readConference(conferenceName);
        }catch(notFoundInDatabase e){
            System.out.println(e.toString());
        }
         
        service.selectArticle(conference, uInterface);
        
    }


}