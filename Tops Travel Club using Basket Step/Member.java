import java.util.*;
/**
 * The Member class models being a member to log into the website
 * 
 * @author (Sabir Hussein) 
 * @version (13/12/23)
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
    private ArrayList<Friend> companions;
    // The array list called companions that stores objects from the holiday class
    private double money;
    // Amount of money the member has
    
    // Constructors
    /**
     * Non default constructor for objects of class Member
     */
    public Member(String email, int membershipNumber, double money)
    {
        this.email = email;
        this.membershipNumber = membershipNumber;
        loggedInStatus = false;
        website = null;
        holiday = null;
        companions = new ArrayList<Friend>();
        this.money = money;
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
        companions = new ArrayList<Friend>();
        money = 550.0;
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
     * Accessor method for money
     */
    public double getMoney()
    {
        return money;
    }
    
    /**
     * Accessor method for array companions
     */
    public int getNumberOfCompanions()
    {
        return companions.size();
    }
    
    /**
     * Accessor method for the array
     */
    public ArrayList<Friend> getCompanions()
    {
        return new ArrayList<>(companions);
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
    
    /**
     * Mutator method for money
     */
    public void setMoney(double money)
    {
        this.money = money;
    }
    
    // Other Methods
    /**
     * Method that allows you to select which holiday you want then outputs this
     * It also checks whether you or your friends have enough money to purchase a holiday
     */
    public void selectHoliday(Holiday holiday)
    {  
        if (loggedInStatus == true)
        {
            if(checkMoney() == true)
            {
                this.holiday = holiday;
                System.out.println("member ID: " + membershipNumber);
                System.out.println("holiday ref number: " + holiday.getRefNumber());
                System.out.println("holiday type: " + holiday.getType());
                System.out.println("holiday price: £" + holiday.getPrice());
            }
            else
            {
                whoCannotPay();
                holiday = null;
            }
        }
        
        else 
        {
            System.out.println("Please log in to a website");
        }
    }
    
    /**
     * Method that does an external method call into website for checkout
     * It also adds up all the money from member and friends and takes away prices
     */
    public void payForHoliday()
    {
       if(loggedInStatus == true)
       {
           for (int i = 0; i < companions.size(); i++) 
           {  
               companions.get(i).setMoney(companions.get(i).getMoney() - (holiday.getPrice()));
           }  
           money -= (holiday.getPrice());
           website.checkout(this);
           System.out.println("Your new money total is " + money);
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
        
    /**
     * To string method for member
     */
    public String toString()
    {
        return "membership number : " + membershipNumber + "\n" + "email : " + email + "\n" + "logged in status : " + loggedInStatus;
    }
        
    /**
     * Method to add a friend to the array
     */
    public void storeFriend(Friend friend)
    {
        companions.add(friend);
    }
        
    /**
     * Method to list all friends in the array
     */
    public void listFriends()
    {
        for( Friend friend : companions )
        {
            System.out.println(friend.toString());
        }
    }
        
    /**
     * Method that will check the money the member and friend has
     */
    private boolean checkMoney()
    {
        if(money > (holiday.getPrice()))
        {    
            for( Friend friend : companions )
            {
                if (friend.getMoney() < (holiday.getPrice()))
                {
                    return false;
                }
                else 
                {
                    return true;
                }
            }    
        }
        return false;
    }
    
    /**
     * Method that will output a message to those who cant afford the cost
     */
    private void whoCannotPay()
    {
        if(money < (holiday.getPrice()))
            {
                System.out.println(membershipNumber + " has insufficient money to afford this holiday");
            }
        
        for( Friend friend : companions )
        {
            if(friend.getMoney() < (holiday.getPrice()))
            {
                System.out.println(friend.getName() + " has insufficient money to afford this holiday");
            }
        }
    }
}
