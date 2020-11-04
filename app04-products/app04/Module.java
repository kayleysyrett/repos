
/**
 * This class stores information about a module of a university course.
 * Each module will have a title, code number and provide a mark for each
 * student.
 *
 * @author Kayley Syrett
 * @version01 4/11/2020
 */
public class Module
{
    private String title; 
    
    private String codeNo;
    
    private int mark;
    
    private boolean completed;

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        mark = 0;
        this.title = title;
        this.codeNo = codeNo;
        completed = false;
    }
    
    /**
     * Award a students mark as a percentage
     */
    public void awardMark(int mark)
    {
        if((mark >=0) &&(mark <= 100))
        {
            this.mark = mark;
            if(mark >= 40)completed = true;
    }
    else
    {
        System.out.println("Invalid Mark!");
    }
}
        

    /**
     * This will print out the module title, codeNo and students mark
     */
    public void print()
    {
        System.out.println("Module: " + codeNo + 
              " " + title + " Mark = " + mark);
    }
    
 
}
