package UI;


import java.util.*;

/**
 * 
 */
public abstract class Command implements UIAction {

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