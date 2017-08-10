
/**
 * the Roster class coverts string list to arraylist of students
 * 
 * @author (Jamal Lewis) 
 * @version (ver 1.0 3/19/16)
 */
import java.util.*;

public class Roster
{
    static String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
             "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
             "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
             "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
             "5,Jamal,Lewis,jlew118@wgu.edu,33,81,90,93"};
             
    static ArrayList<Student> roster = new ArrayList<Student>();
    
    public static void print_all()
    {
       for (Student s: roster)
       {
          System.out.println(String.format("%s\t%s%s\t%s%s\t%s%-30s\t%s\t%s\t%s%s",s.getStudentID(),"First Name: ",s.getFirstName(),"Last Name: ",s.getLastName(),"Email: ",s.getEmail(),"Age: ",s.getAge(),"Grades: ",Arrays.toString(s.getGrades())));
       }
    }
    
    //sets the instance variables from part B1 and updates the roster
    public static void add(String studentID, String firstname, String lastname,
        String emailaddress, int age, int grade1, int grade2, int grade3)
    {
        int [] grades = {grade1,grade2,grade3};
        Student currentStudent = new Student(studentID, firstname, lastname, emailaddress, age, grades);
        
        roster.add(currentStudent);
    }  
    //Removes student by id input
    //@param student id as string
    public static void remove(String CurrentStudentID)
    {
        for (int i = 0; i<roster.size(); i++) 
        {
           if(roster.get(i).getStudentID().equals(CurrentStudentID))
           {
               System.out.println("Student with ID: "+CurrentStudentID+" will be dropped.");
                roster.remove(i);
                return;
           }
          
        }
        System.out.println("Student with ID: "+CurrentStudentID+" was not found.");
    }
    //prints average grades for studennt by id
    public static void print_average_grade(String studentID)
    {
        double sum = 0;
        int [] grades; 
        for (int i = 0; i<roster.size(); i++)
        {
            if(roster.get(i).getStudentID().equals(studentID))
            {
                grades = roster.get(i).getGrades();
                sum = grades[0]+grades[1]+grades[2];
                System.out.println("Student ID#: "+studentID+ " Average Grade: "+sum/grades.length);
            }
        }
    }
    //prints all invalid email addresses
    public static void print_invalid_emails()
    {
        ArrayList<Student> invalid = new ArrayList<Student>();
        for(Student s: roster)
        {
            String mailName = s.getEmail();
            if(mailName.contains(" "))
            {
                invalid.add(s);
            }
            
            if(!mailName.contains("@"))
            {
                invalid.add(s);
            }
            else if (!mailName.contains("."))
            {
               invalid.add(s);
            }
        }
        for(Student stu: invalid)
        {
            System.out.println("The email addresses that are invalid are: "+stu.getEmail());
        }
    }
    
    public static void main(String [] args)
    {
        for (int i = 0; i<students.length; i++)
        {
            String[] mySplit = students[i].split(",");   
            //System.out.println(Arrays.toString(mySplit))
            String studentID = mySplit[0];
            String firstName = mySplit[1];
            String lastName = mySplit[2];
            String email = mySplit[3];
            int age = Integer.parseInt(mySplit[4]);
            int g1 = Integer.parseInt(mySplit[5]);
            int g2 = Integer.parseInt(mySplit[6]);
            int g3 = Integer.parseInt(mySplit[7]);
            int[] grades = {g1,g2,g3};
            
            Student student = new Student(studentID,firstName,lastName,email,age,grades);
            roster.add(student);
        }
        print_all();
        print_invalid_emails();
        for (Student s : roster)
        {
            print_average_grade(s.getStudentID());
        }
        remove("3");
        remove("3");
        print_all();
        
        
    }    
        
   
}
    

