
/**
 * The Member class models being a member to log into the website
 * 
 * @author (Sabir Hussein) 
 * @version (15/11/23)
 */
public class Member
{
     // Member Variables
    private String email;
    // The Email of the member
    private int membershipNumber;
    // The Membership Number of the member
    private boolean loggedInStatus;
    // The Logged in Status of the member
    private Website website;
    // A Refrence pointer to a new website object
    private Holiday holiday;
    // A Refrence pointer to a new holiday object
    
    // Constructors
    /**
     * Non default constructor for objects of class Member
     */
    public Member(String email, int membershipNumber)
    {
        this.email = email;
        this.membershipNumber = membershipNumber;
        loggedInStatus = false;
        website = null;
        holiday = null;
    }
    
    /**
     * Default constructor for objects of class Member
     */
    public Member()
    {
        email = "Joe2@gmail.com";
        membershipNumber = 2;
        loggedInStatus = false;
        website = null;
        holiday = null;
    }
    
    // Accessor Methods
    /**
     * Accessor method for email
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Accessor method for membership number
     */
    public int getMembershipNumber()
    {
        return membershipNumber;
    }
    
    /**
     * Accessor method for logged in status
     */
    public boolean getLoggedInStatus()
    {
        return loggedInStatus;
    }
    
    /**
     * Accessor method for Website
     */
    public Website getWebsite()
    {
        return website;
    }
    
    /**
     * Accessor method for Holiday
     */
    public Holiday getHoliday()
    {
        return holiday;
    }
    
    /**
     * Mutator method for logged in status
     */
    public void setLoggedInStatus(boolean loggedInStatus)
    {
        this.loggedInStatus = loggedInStatus;
    }
    
    // Mutator Methods
    /**
     * Mutator method for email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    /**
     * Mutator method for membership number
     */
    public void setMembershipNumber(int membershipNumber)
    {
        this.membershipNumber = membershipNumber;
    }
    
    /**
     * Mutator method for website (Self refrencing pointer to the website object)
     */
    public void setWebsite(Website website)
    {
        this.website = website;
    }
    
    // Other Methods
    /**
     * Method that allows you to select which holiday you want then outputs this
     */
    public void selectHoliday(Holiday holiday)
    {
        if(loggedInStatus == true)
        {
            this.holiday = holiday;
            System.out.println("member ID: " + membershipNumber);
            System.out.println("holiday ref number: " + holiday.getRefNumber());
            System.out.println("holiday type: " + holiday.getType());
            System.out.println("holiday price: £" + holiday.getPrice());
        }
        else
        {
            System.out.println("Please log in to a website");
        }
    }
    
    /**
     * Method that does an external method call into website for checkout
     */
    public void payForHoliday()
    {
       if(loggedInStatus == true)
       {
          website.checkout(this);
       }
       else 
       {
          System.out.println("Please log in to a website");
       }
    }
    
    /**
     * Method that will reset 'holiday' to null again
     */
    public void resetHoliday()
    {
        holiday = null;
    }
}
