
/**
 * This class stores information about a university course.
 * The courses will have a title and UCAS code.
 *
 * @author Kayley Syrett
 * @version 0.1 02/11/2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String title;
    
    private String codeNo;

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
    }

    /**
     * This will print out the course title and codeNo
     */
    public void print()
    {
                System.out.println("Course: " + title + " " + codeNo);

    }
}
