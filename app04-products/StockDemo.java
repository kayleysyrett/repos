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
     * This StockManager shows some sample products
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;

        manager.addProduct(new Product(101, "Rimmel Lipstick Red"));
        manager.addProduct(new Product(102, "Rimmel Lipstick Pale Pink"));
        manager.addProduct(new Product(103, "MAC Lipstick Fuschia"));
        manager.addProduct(new Product(104, "MAC Lipstick Nude"));
        manager.addProduct(new Product(105, "Loreal Lipstick Peach"));
        manager.addProduct(new Product(106, "Loreal Lipstick Rose Pink"));
        manager.addProduct(new Product(107, "Max Factor Lipstick Plum"));
        manager.addProduct(new Product(108, "Max Factor Lipstick Coral"));
        manager.addProduct(new Product(109, "Maybelline Lipstick Caramel"));
        manager.addProduct(new Product(110, "Maybelline Lipstick Burgandy"));
    }

    /**
     * This method will run all the tests needed to
     * demonstrated that the requirements have been met
     */
    public void runDemo()
    {
        manager.printAllProducts();
        demoDeliverProducts();
        manager.printAllProducts();
        demoSellProducts();
        manager.printAllProducts();
    }

    /**
     * This demonstration shows how the StockManager
     * might be used. Details of one product is shown, the
     * product is restocked, and then the details are shown again.
     */
    private void demoDeliverProducts()
    {
        int quantity = 0;

        for(int id = 101; id <= 110; id++)
        {
            quantity++;
            manager.deliverProduct(id, quantity);
        }
    }

    /**
     * This demonstration shows how the StockManager
     * might be used. Details of one product is shown, the
     * product is restocked, and then the details are shown again.
     */
    private void demoSellProducts()
    {
        int quantity = 0;

        for(int id = 101; id <= 110; id++)
        {
            quantity++;
            manager.sellProduct(id, quantity);
        }
    }

}

