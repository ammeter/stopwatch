package coinpurse;
 
/**
 * A main class to create objects and connect objects together.
 * The user interface needs a reference to coin purse.
 * @author your name
 */
public class Main {

    /**
     * Configure and start the application.
     * @param args not used
     */
    public static void main( String[] args ) {
//TODO follow the steps in the sequence diagram
        // 1. create a Purse
    	Purse purse = new Purse(0);
        // 2. create a ConsoleDialog with a reference to the Purse object
    	ConsoleDialog consoleDialog = new ConsoleDialog();
        // 3. run the ConsoleDialog
    	//run();
    }
}
