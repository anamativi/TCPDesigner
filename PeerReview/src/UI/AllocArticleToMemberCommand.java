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
        String conferenceName = uInterface.readString();
        try{
            nReviewers = uInterface.readInteger();
            conference = service.readConference(conferenceName);
        }catch(InvalidNumberOfReviewersException e){
            System.out.println(e.toString());
        }catch(notFoundInDatabase e){
            System.out.println(e.toString());
        }
        
        service.allocArticlesToMembers(conference,nReviewers,uInterface);
        
    }


}