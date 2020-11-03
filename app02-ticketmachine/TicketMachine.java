/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Kayley Syrett
 */
public class TicketMachine
{
    // The amount of money entered by a customer so far.
    private int balance;
    
    // The total amount of money collected by this machine.
    private int total;
    
    // The price of a ticket from this machine
    public static final Ticket aylesburyTicket = new Ticket("Aylesbury", 220);
    public static final Ticket amershamTicket = new Ticket("Amersham", 300);
    public static final Ticket highWycombeTicket = new Ticket("High Wycombe", 330);

    private Coin coin;
    
    private Ticket userTicket = null;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        
        userTicket = null;
    }


    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public void printBalance()
    {
       System.out.println("your balance is " + balance);
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    
    public void insertCoin(Coin coin)
    {
        balance = balance + coin.getValue();
        printBalance();
    }
    
    /**
    * 
    */
    public void insert10p()
    {
        balance = balance + 10;
        System.out.println("you have inserted 10p");
        printBalance();
    }
    
    /**
     * 
     */
    public void insert20p()
    {
        balance = balance + 20;
        System.out.println("you have inserted 20p");
        printBalance();
    }
    
    /**
    * 
    */
    public void insert100p()
    {
        balance = balance + 100;
        System.out.println("you have inserted 100p");
        printBalance();
    }
    
    /**
    * 
    */
    public void insert200p()
    {
        balance = balance + 200;
        System.out.println("you have inserted 200p");
        printBalance();
    }
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        
        int price = userTicket.getPrice();
        if (balance >= price)
        {
            total = total + price;
            balance = balance - price;
            userTicket.print();
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more pence.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    public void selectAmersham()
    {
        userTicket = amershamTicket;
    }
    
        public void selectAylesbury()
    {
        userTicket = aylesburyTicket;
    }
    
        public void selectHighwycombe()
    {
        userTicket = highWycombeTicket;
    }
    
    public void printTickets()
    {
        System.out.println("The following tickets are available");
        amershamTicket.print();
        aylesburyTicket.print();
        highWycombeTicket.print();
    }
    
}
