import java.util.ArrayList;

/**
 * Manage the stock in a makeup store.
 * The stock is described by zero or more products.
 * 
 * @author Kayley Syrett 
 * @version01 23/11/2020
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct(id);

        if(product != null)
        {
            product.increaseQuantity(amount);
            System.out.println("Product Delivered : " + product);  
        }
        else
        {
            System.out.println("Product ID " + id + " NOT FOUND!");
        }

    }

    /**
     * Try to find a product in the stock with the given id.
     * @return the identified product, or null if there is none
     *         with a matching id.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }

        return null;
    }

    /**
     * Sell an amount of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id, int amount)
    {
        Product product = findProduct(id);

        if(product != null) 
        {
            if(amount > product.getQuantity())
                amount = product.getQuantity();
            product.sell(amount);
        }
        else
        {
            System.out.println("Product ID " + id + " NOT FOUND!");
        }
    }    

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);

        if(product != null)
        {
            System.out.println(product.toString());
        }
        else
        {
            System.out.println("Product ID " + id + " NOT FOUND!");
        }
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            System.out.println("Number in stock = " + product.getQuantity());
        }
        else
        {
            System.out.println("Product ID " + id + " NOT FOUND!");
        }
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printDetails(int id)
    {
        Product product = findProduct(id);

        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }

    /**
     * Print details of all the products.
     * in order they are in the stock list
     */
    public void printAllProducts()
    {
        printHeading();
        
        if(stock.size() == 0)
        {
            System.out.println("Currently you have no stock!");
        }
        else
        {
            for(Product product : stock)
            {
                System.out.println(product);
            } 
        }
    }

    /**
     * This method will print a heading at the 
     * top of the stock list
     */
    public void printHeading()
    {
        System.out.println("\n======================");
        System.out.println("Kayley's Stock List");
        System.out.println("======================\n");
        System.out.println();
    }

    /**
     * 
     * 
     * 
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);

        if(product != null)
        {
            stock.remove(product);
            System.out.println("Product Removed : " + product);  
        }
        else
        {
            System.out.println("Product ID " + id + " NOT FOUND!");
        }

    }

    /**
     * 
     * 
     * 
     */
    public void renameProduct(int id, String newName)
    {
        Product product = findProduct(id);

        if(product != null)
        {
            product.changeName(newName);
            System.out.println("Product Renamed : " + product);  
        }
        else
        {
            System.out.println("Product ID " + id + " NOT FOUND!");
        }

    }
}
