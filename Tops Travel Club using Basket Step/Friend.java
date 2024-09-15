
/**
 * The Friend class models a friend booking a holiday for someone
 * 
 * @author (Sabir Hussein) 
 * @version (13/12/23)
 */
public class Friend
{
    // Friend Variables
    private String name;
    // The name of the friend
    private double money;
    // How much money this friend has to spend

    /**
     * Non default constructor for objects of class Friend
     */
    public Friend(String name, double money)
    {
        this.name = name;
        this.money = money;
    }
    
    /**
     * Default constructor for objects of class Friend
     */
    public Friend()
    {
        name = "Bob";
        money = 550.0;
    }
    
    /**
     * Accessor method for name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Accessor method for money
     */
    public double getMoney()
    {
        return money;
    }
    
    // Mutator Methods
    /**
     * Mutator method for name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Mutator method for money
     */
    public void setMoney(double money)
    {
        this.money = money;
    }
        
    /**
     * To string method for friend
     */
    public String toString()
    {
        return "name : " + name + "\n" +" money : " + money;
    }
}
