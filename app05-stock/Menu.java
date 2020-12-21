
/**
 * Write a description of class Menu here.
 *
 * @author Kayley Syrett
 * @version 1, 21st December 
 */
public class Menu
{
    private static InputReader reader = new InputReader();
    
    /**
     * Display all the valid choices and make sure that the
     * user has chose one before returning
     */
    public static String getMenuChoice(String [] choices)
    {
        boolean finished = false;
        String choice = null;
        
        while(!finished)
        {
            printChoices(choices);

            choice = reader.getInput();
            choice = choice.toLowerCase();
            
            // To Do check that the choice is valid 

        }
        
        return choice;
    }
    
    private static boolean checkIsValid(String [] choices, String choice)
    {
        return false;
    }

    private static void printChoices(String [] choices)
    {
        System.out.println("  Enter the first word, your choices are: \n");
        for(String choice: choices)
        {
            System.out.println(choice);
        }
    }
    
}
