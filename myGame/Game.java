
/**
 * The Game class models a real guy and has a game manager link to this class
 * 
 * @author (Sabir Hussein) 
 * @version (25/10/23)
 */
public class Game
{   // Game Variables
    private String title;
    // The objective of the game
    private String objective;
    // The cost in pence of the game
    private int costInPence;
    // The number of downloads of the game
    private int numberOfDownloads;
    // The name of the user with the best high score of the game
    private String bestScoreName;
    // The best high score of the game
    private int bestScore;
    // The game manager and link to manager class
    private Manager gameManager;
    // The title of the game
    
    // Constructors
    /**
     * Non default constructor for objects of class Game
     */
     public Game(String newTitle, String newObjective, int newCostInPence, Manager newGameManager)
     {
        title = newTitle;
        objective = newObjective;
        costInPence = newCostInPence;
        numberOfDownloads = 0; // no one downloaded the mark
        bestScoreName = ""; // no name for best score
        bestScore = 0; // no best score for this game
        gameManager = newGameManager; // 
     }
 
    /**
     * Default constructor for objects of class Game
     */
       public Game()
       {
        title = "Revenge of the Killer Zombies";
        objective = "To thrill the user";
        costInPence = 75;
        numberOfDownloads = 6784;
        bestScoreName = "Prof Bass";
        bestScore = 20000;
        gameManager = new Manager("Jones", "A132");
       }
       
    // Accessor Methods
    /**
     * Accessor method for title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Accessor method for objective
     */
    public String getObjective()
    {
        return objective;
    }
    
    /**
     * Accessor method for cost in pence
     */
    public int getCostInPence()
    {
        return costInPence;
    }
    
    // Mutator Methods
    /**
     * Mutator method for the title of the game
     */
    public void setTitle(String setTitle)
    {
        title = setTitle;
    }
    
    /**
     * Mutator method for the objective of the game
     */
    public void setObjective(String setObjective)
    {
        objective = setObjective;
    }
    
    /**
     * Mutator method for the cost in pence of the game
     */
    public void setCostInPence(int setCostInPence)
    {
        costInPence = setCostInPence;
    }
    
    // Other Methods
    /**
     * Method that simulates 'downloading' the game
     */
    public void download()
    {
        // A message will appear with the current price and congatulate your download
        System.out.println("Congratulations on your download! Please pay " + costInPence + " pence. Thank You");
        // Adds one to the number of download value
        numberOfDownloads += 1;
    }
    
    /**
     * Checks the score you input
     */
    public void checkScore(int newScore, String newScoreName)
    {
        if (newScore > bestScore)
        { 
            // Updates best score and adds their name if the input is the higher than prvious score
            bestScore = newScore;
            bestScoreName = newScoreName;
        }
 
    }
    
    /**
     * Value returning method to calculate earnings
     */
    public int calculateEarnings()
    {
        // Multiplies the all time downloads and cost of the game and returns this value
        return numberOfDownloads * costInPence;
    }
    
    /**
     * Prints out all the details of the game to the terminal window
     */
    public void printReport()
    {
    // Prints out all the details of the game
    System.out.println("Title: " + title);
    System.out.println("Objective: " + objective);
    System.out.println("Download cost: " + costInPence);
    System.out.println("Number of downloads to date: " + numberOfDownloads);
    System.out.println("Best score to date: " + bestScore );
    System.out.println("Player with best score: " + bestScoreName);
    System.out.println("Total earnings to date: " + calculateEarnings());
    System.out.println("Game manager: " + gameManager.getSurname());
    }

}
