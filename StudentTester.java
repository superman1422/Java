
/**
 * Write a description of class StudentTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class StudentTester
{
    static int [] myGrades = {88,79,92};
    static int [] failGrades ={66,62,65};
    public static void main(String[] args)
    {
        Student j = new Student("5", "Jamal", "Lewis", "writingfornoreason@gmail.com", 33, myGrades);
        //j.setStudentID(14);
        //System.out.println(j.getStudentID());
        //j.setGrades(failGrades);
        //System.out.println(j.getEmail());
        //System.out.println(j.getAge());
        
        j.printIDNum();
        j.printFirstName();
        j.printLastName();
        j.printEmail();
        j.printGrades();
        
    }
    
}
 