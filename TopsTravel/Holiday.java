
/**
 * The Holiday class models different holidays a member can select on the website and pay for
 * 
 * @author (Sabir Hussein) 
 * @version (15/11/23)
 */
public class Holiday
{
    // Holiday Variables
    private String refNumber;
    // The refNumber of the hoiday
    private String type;
    // The typw of holiday it is
    private double price;
    // The price of the holiday

    /**
     * Non default constructor for objects of class Holiday
     */
    public Holiday(String refNumber, String type, double price)
    {
        this.refNumber = refNumber;
        this.type = type;
        this.price = price;
    }
    
    /**
     * Default constructor for objects of class Holiday
     */
    public Holiday()
    {
        refNumber = "W1473";
        type = "touring";
        price = 550;
    }
    
    // Accessor Methods
    /**
     * Accessor method for refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Accessor method for type
     */
    public String getType()
    {
        return type;
    }
    
    /**
     * Accessor method for price
     */
    public double getPrice()
    {
        return price;
    }
    
    // Mutator Methods
    /**
     * Mutator method for refNumber
     */
    public void setRefNumber(String refNumber)
    {
        this.refNumber = refNumber;
    }
    
    /**
     * Mutator method for type
     */
    public void setType(String type)
    {
        this.type = type;
    }
    
    /**
     * Mutator method for price
     */
    public void setPrice(double price)
    {
        this.price = price;
    }
}
