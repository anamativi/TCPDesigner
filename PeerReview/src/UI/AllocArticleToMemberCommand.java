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
        Service service = new Service();
        UserInterface uInterface = new UserInterface();
        Conference conference = uInterface.readConference();
        int nReviewers = uInterface.readNumberOfReviewers();
      
        service.allocArticlesToMembers(conference,nReviewers,uInterface);
        
    }


}