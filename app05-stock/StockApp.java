
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Kayley Syrett
 * @version 0.1
 */
public class StockApp
{
    // Use to get user input
    public final int FIRST_ID = 200;
    
    private InputReader input;

    private StockManager manager;
    
    private int nextID = FIRST_ID;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
    }

    /**
     * 
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getInput();
            choice = choice.toLowerCase();

            if(choice.equals("quit"))
                finished = true;
        }
    }

    /**
     * 
     */
    public void executeMenuChoice(String choice)
    {
        if(choice.equals("add"))
        {
          addProduct();
        }
    }
    
    public void addProduct()
    {
        System.out.println("Add a new Product");
        System.out.println();
        
        System.out.println("Please enter the name of the product");
        String name = input.getInput();
        
        Product product = new Product(nextID, name);
        manager.addProduct(product);
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Kayley Syrett");
        System.out.println("******************************");
    }
}
