import java.util.Date;
/**
 * This ticket class will store the destination, date and price of the purchase.
 *
 * @author Kayley Syrett
 * @version 0.1 3rd November 2020
 */
public class Ticket
{    
    // Journey Destination
    private String destination;
    
    //This is the ticket price in pence
    private int price;
    
    //This is the date and time ticket was issued
    private Date dateTime;
    
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;
        dateTime = new Date();
    }
    
    /**
     * This method will print the ticket with destination price and time of 
     * ticket issue
     */
    public void print()
    {
        System.out.println("Ticket To " + destination);
        System.out.println("Price " + price + "p ");
        System.out.println("Issued " + dateTime);
    }
    
    

}
