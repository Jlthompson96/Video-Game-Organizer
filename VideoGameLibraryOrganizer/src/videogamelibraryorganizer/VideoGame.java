/*
 * Video Game Class
 */
package videogamelibraryorganizer;

/**
 * @author joeythompson
 * @version 1.0
 */
public class VideoGame {

    //Variables
    private String title;
    private String rating;
    private String console;

     /**
     * No Argument Constructor
     */
    public VideoGame() {
        this.console = "";
        this.title = "";
        this.rating = "";
    }
    /**
     * Constructor w/arguments
     * @param title Title of Game
     * @param rating Rating of Game
     * @param console Console Game Runs on
     */
    public VideoGame(String title, String rating, String console) {
        this.title = title;
        this.rating = rating;
        this.console = console;
    }
    /**
     * Sets Title
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Sets Rating
     * @param rating 
     */
    public void setRating(String rating) {
        this.rating = rating;
    }
    /**
     * Sets Console
     * @param console 
     */
    public void setConsole(String console) {
        this.console = console;
    }
    /**
     * Returns Title
     * @return title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Returns Rating
     * @return rating
     */
    public String getRating() {
        return rating;
    }
    /**
     * Returns Console
     * @return console
     */
    public String getConsole() {
        return console;
    }
       
    /**
     * toString to output ArrayList data
     * @return toString()
     */
    @Override
    public String toString() {
        return String.format(" Game: " + title +
                       "\n Rating: " + rating +
                       "\n Console " + console);
    }
}
