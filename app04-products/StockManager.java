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
    public void delivery(int id, int amount)
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
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        Product product = findProduct(id);

        if(product != null) 
        {
            printDetails(id);
            product.sellOne();
            printDetails(id);
        }
    }    

    /**
     * show details of the given product. If found,
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
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
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
    }

    /**
     * Print out all of the products
     */
    public void printAllProducts()
    {
        System.out.println();
        System.out.println("Lipstick Stock List");
        System.out.println("====================");
        System.out.println();

        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
}
