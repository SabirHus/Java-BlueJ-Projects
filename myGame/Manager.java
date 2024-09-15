
/**
 * Contains the details of the game manager
 * 
 * @author (Sabir Hussein) 
 * @version (25/10/23)
 */
 
public class Manager
{   // Setting up the Class Manager
    // The surname of the manager
    private String surname;
    // The ID of the manager
    private String managerID;
 
    /**
     * Non Default Constructor for objects of class Manager
     */
    public Manager(String newSurname, String newManagerID)
    {
        surname = newSurname;
        managerID = newManagerID;
    }
    
    // Accessor Methods 
    /**
     * Accessor Method for the surname()
     */
    public String getSurname()
    { 
        return surname;
    }
      
    /**
     * Accessor Method for the managerID()
     */
    public String getManagerID()
    {
        return managerID;
    }
 
}
