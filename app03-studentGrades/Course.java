 


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
    public static final int MINIMUM_PASS = 40;
    
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
        else if(moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        else if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        else if(moduleNo == 4)
        {
            module4.awardMark(mark);
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
        
        System.out.println(" Final Mark = " + finalMark + "%");
        System.out.println(" Final Grade = " + finalGrade);
    }

    private Grades convertToGrade(int mark)
    {
        if((mark>= 0) && (mark < MINIMUM_PASS))
        {
            return Grades.F;
        }
        else if((mark >= 40) && (mark < 50))
        {
            return Grades.D;
        }
        else if((mark>= 50) && (mark < 60))
        {
            return Grades.C;
        }
        else if((mark>= 60) && (mark < 70))
        {
            return Grades.B;
        }
        else if((mark>= 70) && (mark <= 100))
        {
            return Grades.A;
        }
        
        return Grades.X;

    }
    
    public void calculateMark()
    {
        if(module1.isComplete() & module2.isComplete() & 
           module3.isComplete() & module4.isComplete())
        {
           finalMark = module1.getMark() + module2.getMark() + 
                       module3.getMark() + module4.getMark();
           finalMark = finalMark / 4;
           finalGrade = convertToGrade(finalMark);
        }
        else 
        {
            System.out.println("The course is not complete");
        }
    }
    
}
