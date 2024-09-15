import java.util.*;
/**
 * The Website class models a website selling various holidays to their members
 * 
 * @author (Sabir Hussein) 
 * @version (13/12/23)
 */
public class Website
{
     // Website Variables
    private String websiteName;
    // The website name
    private int hits;
    // The hits are the amount of members lopgged in the website
    private double salesTotal;
    // The sales total is the amount of money taken at the checkout
    private ArrayList<Member> loggedInList;
    // The array list called logged in list that stores objects from the member class

    /**
     * Non Default constructor for objects of class Website
     */
    public Website(String websiteName)
    {
        this.websiteName = websiteName;
        hits = 0;
        salesTotal = 0;
        loggedInList = new ArrayList<Member>();
    }
    
    /**
     * Default constructor for objects of class Website
     */
    public Website()
    {
        websiteName = "Club 18";
        hits = 0;
        salesTotal = 0;
        loggedInList = new ArrayList<Member>();
    }
    
    // Accessor Methods
    /**
     * Accessor method for website name
     */
    public String getWebsiteName()
    {
        return websiteName;
    }
    
    /**
     * Accessor method for hits
     */
    public int getHits()
    {
        return hits;
    }
    
    /**
     * Accessor method for salesTotal
     */
    public double getSalesTotal()
    {
        return salesTotal;
    }
    
    /**
     * Accessor method for array size
     */
    public int getNumberOfUsers()
    {
        return loggedInList.size();
    }
    
    /**
     * Accessor method for the array
     */
    public ArrayList<Member> getLoggedInMembers()
    {
        return new ArrayList<>(loggedInList);
    }
    
    // Mutator Methods
    /**
     * Mutator method for website name
     */
    public void setWebsiteName(String websiteName)
    {
        this.websiteName = websiteName;
    }
    
    /**
     * Mutator method for hits
     */
    public void setHits(int hits)
    {
        this.hits = hits;
    }
    
    /**
     * Mutator method for sales total
     */
    public void setSalesTotal(double salesTotal)
    {
        this.salesTotal = salesTotal;
    }
    
    // Other Methods
    /**
     * Method to model the member logging into the website
     */
    public void memberLogin(Member member)
    {
        member.setLoggedInStatus(true);
        System.out.println(websiteName + " welcomes " + member.getMembershipNumber() + ", you are now logged in");
        member.setWebsite(this);
        hits +=1;
        loggedInList.add(member);
    }
    
    /**
     * Method to model the member logging out of the website
     */
    public void memberLogout(Member member)
    {
        member.setLoggedInStatus(false);
        System.out.println("Good Bye " + member.getMembershipNumber() + ", you are now logged out");
    }
    
    /**
     * Method to model checking out and paying for the holiday
     * Adding a 10% discount for every 10 hits (x 0.90 is 90 percent)
     */
    public void checkout(Member member)
    {
        if (member.getHoliday() != null && checkHitDiscount() == true)
        {
            salesTotal += (member.getHoliday().getPrice() * 0.9) * (member.getNumberOfCompanions() + 1);
            System.out.println("Congratulations you have earned a 10% discount");
            member.resetHoliday();
            memberLogout(member);
        }
        
        else if (member.getHoliday() != null && checkHitDiscount() == false)
        {
            salesTotal += member.getHoliday().getPrice() * (member.getNumberOfCompanions() + 1);
            System.out.println("You have successfully completed this transaction");
            member.resetHoliday();
            memberLogout(member);
        }
        
        else
        {
            System.out.println("Please select a holiday");
        }
        
    }
    
    /**
     * Method to check the amount of hits on the website 
     * Checking if there's a 10% discount
     */
    private boolean checkHitDiscount()
    {
        if(hits > 0 && hits % 10 == 0)
        {  
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
    /**
     * Lists all the members in the logged in list array
     */
    public void listMembersLoggedIn()
    {
        for( Member member : loggedInList )
        {
            System.out.println(member.toString());
        }
    }
}
