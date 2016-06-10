package Service;


public class notFoundInDatabase extends Exception{
    
    public notFoundInDatabase(String message){
        super(message);
    }
}
