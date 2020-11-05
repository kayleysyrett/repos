 


/**
 * This class stores information about a university course.
 * The courses will have a title, course code and provide a mark for 
 * each student.
 *
 * @author Kayley Syrett
 * @version 0.1 04/11/2020
 */
public class Course
{
    private String title;

    private String codeNo;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;

    private int finalMark;

    private Grades finalGrade;

    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;

        module1 = new Module("Computer Architectures", "C0450");
        module2 = new Module("Programming Concepts", "C0452");
        module3 = new Module("Professional Practice", "C0454");
        module4 = new Module("Web Development", "C0456");
    }

    /**
     * This method will add a mark to a module for a student
     */
    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
            
        }

    }

    /**
     * This will print out the course title and codeNo
     */
    public void print()
    {
        System.out.println("Course: " + title + " " + codeNo);
        module1.print();
        module2.print();
        module3.print();
        module4.print();
    }

    public Grades convertToGrade(int mark)
    {
        if((mark>= 0) && (mark < 40))
        {
            return Grades.F;
        }

        return Grades.X;

    }
}
