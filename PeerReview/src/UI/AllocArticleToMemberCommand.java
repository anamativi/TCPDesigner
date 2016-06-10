package UI;


import UI.Command;
import Service.Service;
import Service.notFoundInDatabase;
import RLObjects.Conference;
import java.util.*;


public class AllocArticleToMemberCommand extends Command {


    public AllocArticleToMemberCommand() {
    }

    @Override
    public void execute(){
        int nReviewers=0;
        Conference conference=null;
        Service service = new Service();
        UserInterface uInterface = new UserInterface();
        String conferenceName = uInterface.readConference();
        try{
            nReviewers = uInterface.readNumberOfReviewers();
            conference = service.readConference(conferenceName);
        }catch(notFoundInDatabase e){
            System.out.println(e.toString());
        }
        
        service.allocArticlesToMembers(conference,nReviewers,uInterface);
        
    }


}