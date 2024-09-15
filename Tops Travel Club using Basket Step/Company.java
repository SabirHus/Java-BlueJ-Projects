import java.util.*;
/**
 * This Class will be used to keep track of all the websites for a given company
 * 
 * @author (Sabir Hussein) 
 * @version (13/12/23)
 */
public class Company
{
    // Company Variables
    private String companyName;
    // The company name
    private ArrayList<Website> listOfWebsites;
    // The array list of websites
    /**
     * Non Default constructor for objects of class Company
     */
    public Company(String companyName)
    {
        this.companyName = companyName;
        listOfWebsites = new ArrayList<Website>();
    }
    
    /**
     * Default constructor for objects of class Company
     */
    public Company()
    {
        companyName = "BGC INC";
        listOfWebsites = new ArrayList<Website>();
    }
    
    //Accessor Method
    /**
     * Accessor method for company name
     */
    public String getCompanyName()
    {
        return companyName;
    }
    
    /**
     * Accessor method for array
     */
    public int getNumberOfWebsites()
    {
        return listOfWebsites.size();
    }
    
    // Mutator Method
    /**
     * Mutator method for company name
     */
    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }
    
    /**
     * Adds the website to the company array
     */
    public void storeWebsite(Website website)
    {
        listOfWebsites.add(website);
    }
    
    // Other Methods
    /**
     * Lists all the websites in the company array
     */
    public ArrayList<Website> getWebsiteList()
    {
        return new ArrayList<>(listOfWebsites);
    }
    
    /**
     * Lists all the websites whose sales total is above the argument (profit)
     */
    public ArrayList<Website> findProfitableWindows(double profit)
    {
        ArrayList<Website> websiteProfit = new ArrayList<>();
        for( Website website : listOfWebsites )
        {
            if(website.getSalesTotal() > profit)
            {
                websiteProfit.add(website);
            }
        }
        return websiteProfit;
    }
    
    /**
     * Lists all the members logged into any website that has chosen this website
     */
    public ArrayList<Member> findMembersHoliday(Holiday holiday)
    {
       ArrayList<Member> members = new ArrayList<>();
        for( Website website : listOfWebsites )
       {
           for (Member member : website.getLoggedInMembers())
           {
              if (member.getHoliday() != null && member.getHoliday().equals(holiday))
               {
                   members.add(member);
               }
           }
       } 
       return members;
    }
}