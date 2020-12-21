
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
    public final int FIRST_ID = 101;
    public final String ADD = "add";
    public final String REMOVE = "remove";
    public final String PRINTALL = "printall";

    private InputReader input;

    private StockManager manager;

    private StockDemo demo;

    private int nextID = FIRST_ID;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
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

            executeMenuChoice(choice);

            if(choice.equals("quit"))
                finished = true;
        }
    }

    /**
     * 
     */
    public void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct();
        }
        else if(choice.equals(REMOVE))
        {
            removeProduct();
        }
        else if(choice.equals(PRINTALL))
        {
            printAllProducts();
        }
    }

    public void addProduct()
    {
        System.out.println("Add a new Product");
        System.out.println();

        System.out.println("Please enter the name of the product");
        String name = input.getInput();

        boolean isDuplicate = manager.isDuplicateID(nextID);
        if(isDuplicate)
        {
            boolean finished = false;

            while(!finished)
            {
                nextID++;
                if(!manager.isDuplicateID(nextID))
                {
                    finished = true;
                }
            }

        }

        Product product = new Product(nextID, name);
        manager.addProduct(product);

        System.out.println("\nAdded " + product + " to the stock\n");
        nextID++; 
    }

    public void removeProduct()
    {
        System.out.println("Remove an old Product");
        System.out.println();

        System.out.println("Please enter the id of the product ");
        String number = input.getInput();

        int id = Integer.parseInt(number);

        manager.removeProduct(id);
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:         Add a new product");
        System.out.println("    Remove:      Remove an old product");
        System.out.println("    PrintAll:    Print all products");
        System.out.println("    Quit:        Quit the program");
        System.out.println();        
    }

    public void printAllProducts()
    {
        manager.printAllProducts();
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
