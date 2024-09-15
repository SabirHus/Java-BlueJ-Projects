
/**
 * The House class models a real house and people can buy and sell this house
 * 
 * @author (Sabir Hussein) 
 * @version (10/10/2023)
 */
public class House
{   // The house variables
    // The type of house e.g. 4 bed roomed detached
    private String typeOfHouse;
    // Address of the house
    private String address;
    // Initial purchase price of the house i.e. the price when sold for the first time
    private int initialPurchasePrice;
    // Purchase price of the house i.e. the price when bought by current owner
    private int purchasePrice;
    // Home energy rating of the house (scale from 1 - 5 inclusive)
    private int homeEnergyRating;
    // Council tax band of the house (Range from A to E)
    private char councilTaxBand;
    // Name of the present owner of the house
    private String owner;
    // Number of owners this house has had
    private int numberOfOwners;
    // Whether the house has a garage or not
    private boolean hasGarage;

    /**
     * Constructor for objects of class House
     */
    public House(String setTypeOfHouse, String setAddress, int setInitialPurchasePrice, int setHomeEnergyRating, char setCouncilTaxBand, boolean setHasGarage)
    {
        // Initialise house variables
       typeOfHouse = setTypeOfHouse;
       address = setAddress;
       initialPurchasePrice = setInitialPurchasePrice;
       homeEnergyRating = setHomeEnergyRating;
       councilTaxBand = setCouncilTaxBand;
       hasGarage = setHasGarage;
       purchasePrice = setInitialPurchasePrice;
       owner = "";
       numberOfOwners = 0;
       
    }
    
    /**
     * Sets new home energy rating
     * 
     * @param new home energy rating
     * @return none
     */
    public void goingGreener(int setHomeEnergyRating)
    {
        homeEnergyRating = setHomeEnergyRating;
    }
    
    /**
     * Returns the type of house
     * 
     * @param no parameter needed
     * @return the type of house
     */
    public String getType()
    { 
        return typeOfHouse;
    }
    
    /**
     * Returns the address of the house
     * 
     * @param no parameter needed
     * @return the address
     */
    public String getAddress()
    { 
        return address;
    }

    /**
     * Returns the initial purchase price of the house 
     * 
     * @param no parameter needed 
     * @return the initial purchase price
     */
    public int getInitialPurchasePrice() 
    {
        return initialPurchasePrice;
    }
    
    /**
     * Returns the purchase price of the house
     * 
     * @param no parameter needed
     * @return the purchase price
     */
    public int getPurchasePrice()
    { 
        return purchasePrice;
    }

    /**
     * Returns the home energy rating for the house
     * 
     * @param no parameter needed 
     * @return the home energy rating
     */
    public int getHomeEnergyRating() 
    {
        return homeEnergyRating;
    }

    /**
     * Returns the council tax band for the house
     * 
     * @param no parameter needed 
     * @return the council tax band
     */
    public char getCouncilTaxBand() 
    {
        return councilTaxBand;
    }

    /**
     * Returns the current owner of the house
     * 
     * @param no parameter needed 
     * @return the current owner
     */
    public String getOwner() 
    {
        return owner;
    }

    /**
     * Returns the number of owners to date
     * 
     * @param no parameter needed 
     * @return the number of owners
     */
    public int getNumberOfOwners() 
    {
        return numberOfOwners;
    }

    /**
     * Returns whether the house has a garage of not
     * 
     * @param no parameter needed 
     * @return the boolean for having a garage
     */
    public boolean hasGarage() 
    {
        return hasGarage;
    }
    
    /**
     * Prints out all the details of the house to the terminal window
     */
    public void printDetails()
    {
        // Prints out all the details of the house 
        System.out.println("House type: " + typeOfHouse);
        System.out.println("Address: " + address);
        System.out.println("Original purchase price in pounds: " + initialPurchasePrice);
        System.out.println("Current price in pounds: " + purchasePrice);
        System.out.println("Home energy rating: " + homeEnergyRating);
        System.out.println("Council Tax Band: " + councilTaxBand);
        System.out.println("Number of owners to date: " + numberOfOwners);
        System.out.println("Current owner: " + owner);
    }
    
    /**
     * Checks the home energy rating
     * 
     * @param no parameter needed
     * @return none
     */
    public void checkHomeEnergyRating()
    {
        if (homeEnergyRating <3)
        {
            // A negative message will appear if the home energy rating is below or equal to 3
            System.out.println("Be aware that extra green taxes may be imposed on this house");
        }
        
        else
        {
            // A positive message will appear if it above 3
            System.out.println("This house will not be subject to extra taxes");
        }
    }
    
    /**
     * 'Selling' the house
     * 
     * @param the new owner and the purchase price
     * @return none
     */
    public void sell(String setOwner, int setPurchasePrice)
    {
        // Sets the purchase price of the house    
        purchasePrice = setPurchasePrice;
        // Sets the owner of the house
        owner = setOwner;
        
        // Add the owner onto the number of owners to date list
        numberOfOwners += 1;
        }
    }