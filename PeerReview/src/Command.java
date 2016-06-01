
import java.util.*;

/**
 * 
 */
public abstract class Command {

    /**
     * Default constructor
     */
    public Command() {
    }

    /**
     * 
     */
    public UserInterface ui;


    /**
     * @return
     */
    public abstract void execute();

}