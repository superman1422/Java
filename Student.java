
/**
 * this class creates the student objects and defines the methods to be used
 * 
 * @author (Jamal Lewis) 
 * @version (ver 1.0 3/18/16)
 */
import java.util.Arrays;
import java.util.ArrayList;

public class Student
{
    // instance variables - replace the example below with your own
    private String studentID;
    private int age;
    private String firstName;
    private String lastName;
    private String email;
    private int[] grades = new int[3];

    
   
    /**
     * Constructor for objects of class Student
     *
     */
    public Student(String studentID, String firstName, String lastName, String email,int age, int[]grades)
    {
       this.studentID = studentID;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.age = age;
       this.grades = grades;
    }
    /**
     * gets the value for student id number
     */
    public String getStudentID()
    {
        return studentID;
    }
    /**
     * gets the string for students first name
     */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * gets the string for students last name
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * gets the String for students email
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * gets the value for students age
     */
    public int getAge()
    {
        return age;
    }
    /**
     * gets the value for students grades in array form
     */
    public int [] getGrades()
    {
        return grades;
    }
    /**
     * sets the value for students id number
     */
    public void setStudentID(String IDNum)
    {
        studentID = IDNum;
    }
    /**
     * sets the String for students first name
     */
    public void setFirstName(String fName)
    {
        firstName = fName  ;
    }
    /**
     * sets the String for students last name
     */
    public void setLastName(String lName)
    {
        lastName = lName;
    }
    /**
     * sets the String for students email
     */
    public void setEmail(String eml)
    {
        email = eml;
    }
    /**
     * sets the value for students age
     */
    public void setAge(int ageNum)
    {
        age = ageNum;
    }
    /**
     * sets the value for grade array
     */
    public void setGrades(int [] gradeList)
    {
        grades = gradeList;
    }
   
   /**
     * prints the String for students ID number
     */
    public void printIDNum()
    {
        System.out.println(getStudentID());
    } 
    
    /**
     * prints the String for students first name
     */
    public void printFirstName()
    {
        System.out.println(getFirstName());
    }
    
    /**
     * prints the String for students last name
     */
    public void printLastName()
    {
        System.out.println(getLastName());
    }
    /**
     * prints the String for students email address
     */
    public void printEmail()
    {
        System.out.println(getEmail());
    }
    
    /**
     * prints the value for students age
     */
    public void printAge()
    {
        System.out.println(getAge());
    }
    /**
     * prints the values for students grades
     */
    public void printGrades()
    {
        System.out.println(Arrays.toString(getGrades()));
    }
    
    public String toString() 
    {
        return String.format("%s\t%s%s\t%s%s\t%s%-30s\t%s\t%s\t%s%s",studentID,"First Name: ",firstName,"Last Name: ",lastName,"Email: ",email,"Age: ",age,"Grades: ",Arrays.toString(getGrades()));
    }
    /**
     * prints the student information
     */
    public void print()
    {
        System.out.println(String.format("%s\t%s%s\t%s%s\t%s%-30s\t%s\t%s\t%s%s",studentID,"First Name: ",firstName,"Last Name: ",lastName,"Email: ",email,"Age: ",age,"Grades: ",Arrays.toString(getGrades())));
    }
}
