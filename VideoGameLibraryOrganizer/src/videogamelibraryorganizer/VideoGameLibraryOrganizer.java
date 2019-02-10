/*
 * This is the main class for the Video Game Library Project
 * This class takes user input from the user and creates a VideoGame object
 * that gets stored in an ArrayList to be then outputed to the user.
 */
package videogamelibraryorganizer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version 1.0
 * @author joeythompson
 */
public class VideoGameLibraryOrganizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String title;
        String rating;
        String console;
        char choice;
        int counter = 0;
        
        //ArrayList to store VideoGame objects
        ArrayList<VideoGame> gameInfo = new ArrayList<>();
        
        /**
         * Do-While loop to take in user input
         * @param title
         * @param rating
         * @param console
         */
        do {
            System.out.println("Enter the title of the game: ");
            title = keyboard.nextLine();

            System.out.println("Enter the game rating from the ESRB: ");
            rating = keyboard.nextLine();

            System.out.println("Enter the console the game runs on");
            console = keyboard.nextLine();

            VideoGame game = new VideoGame(title,rating,console);
            
            gameInfo.add(game);
            System.out.println("Would you like to add another game? " +
                                 "Type 'Y' for Yes or 'N' for No");
            choice = keyboard.nextLine().charAt(0); 
        } while (choice == 'y' || choice == 'Y'); 
        
        //Output data in VideoGame ArrayList    
        for (int i = 0; i < gameInfo.size();i++) {
            System.out.println();
            System.out.println(gameInfo.get(i));
            System.out.println("-------------------");
            counter++;
        }
        
        //Call Counter Method
        gameCounter(counter);
    }
 /**
 * @param counter passed in to allow method to decide which output to display 
 */
    public static void gameCounter(int counter) {
        if (counter != 1) {
            System.out.println("You entered " + counter + " games");  
        } else {
            System.out.println("You entered 1 game");
        }
  
    }    
}
