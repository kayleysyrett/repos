/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * @modified by Kayley Syrett 
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101, "Meg & Mog Comes To School"));
        manager.addProduct(new Product(102, "Meg & Mog At Sea"));
        manager.addProduct(new Product(103, "Meg & Mog On The Moon"));
        manager.addProduct(new Product(104, "Meg & Mog Goes To Bed"));
        manager.addProduct(new Product(105, "Meg & Mog Megs Veg"));
        manager.addProduct(new Product(106, "Meg & Mog And The Pirate"));
        manager.addProduct(new Product(107, "Meg & Mog And The Dragon"));
        manager.addProduct(new Product(108, "Meg & Mog Up The Creek"));
        manager.addProduct(new Product(109, "Meg & Mog Mog's Missing"));
        manager.addProduct(new Product(110, "Meg & Mog At The Zoo"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProduct()
    {
        // Show details of all of the products before delivery.
        manager.printProduct(101);
        
        // Take delivery of 5 items of one of the products.
        manager.delivery(101, 5);
        
        // Show the list of all products after delivery
        manager.printProduct(101);
    }
    

    
}
