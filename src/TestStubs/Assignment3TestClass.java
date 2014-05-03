

package TestStubs;

import ClassHiearchy_Assignment3.Classroom;
import ClassHiearchy_Assignment3.Faculty;
import ClassHiearchy_Assignment3.FacultyClass;
import ClassHiearchy_Assignment3.OfferedClass;
import ClassHiearchy_Assignment3.Student;
import ClassHiearchy_Assignment3.StudentClass;
import interfaces.IClass;
import java.util.GregorianCalendar;


/**
 *
 * @author bryan
 */
public class Assignment3TestClass {
    
    public static void main(String [] args)
    {
    // Create a classroom
       Classroom croom = new Classroom("FA209", 'l');
       System.out.println("Classroom: " + croom.toString());
       
       // Create an offered class
       IClass offeredClass = new OfferedClass(90.301f, "Java Programming", croom);
       System.out.println("Offered Class: " + offeredClass.toString());
       
       // Create a Student
       Student newStudent = new Student();
       GregorianCalendar dateOfBirth = new GregorianCalendar(75,7, 3);
       newStudent.setDateOfBirth(dateOfBirth);
       newStudent.setName("Kathy Smith");
       newStudent.setAddress("1 Beech Ave");
       newStudent.setSSN("567876567");
       GregorianCalendar dog = new GregorianCalendar(90, 6, 10);
       newStudent.setDateOfGraduation(dog);
       
       // Create a StudentClass using data from the offered class
       StudentClass studentClass = new StudentClass
                                       (offeredClass.getClassIdNumber(), 
                                        offeredClass.getClassName(), 
                                        offeredClass.getClassroom());
       
       // Add grades to StudentClass
       studentClass.getGrades().add(90.5f);
       studentClass.getGrades().add(100f);
       studentClass.getGrades().add(70.5f);
       studentClass.getGrades().add(65f);
       

       // Add the StudentClass to the Student
       newStudent.getClasses().add(studentClass);

       // Calculate gpa
       newStudent.calculateGPA();
       
       // Print out the data for the new student
       System.out.println(newStudent.toString());

       // Create a faculty
       Faculty faculty = new Faculty();
       GregorianCalendar dateOfHire = new GregorianCalendar(85,12, 3);
       faculty.setDateOfBirth(dateOfHire);
       faculty.setName("Elizabeth Kramer");
       faculty.setAddress("1 University Ave");
       faculty.setSSN("123456789");
       faculty.setStatus('f');
       GregorianCalendar GregorianCalendarOfTermination = new GregorianCalendar(30, 6, 10);
       faculty.setDateOfHire(GregorianCalendarOfTermination);
    
       // Create a StudentClass using data from the offered class
       FacultyClass facultyClass = new FacultyClass
                                                (offeredClass.getClassIdNumber(), 
                                                 offeredClass.getClassName(), 
                                                 offeredClass.getClassroom());

       // Add students to the class
       facultyClass.addStudent(newStudent);
      
       // Add the class to a faculty
       faculty.addClass(facultyClass);

       // Print out the faculty data
       System.out.println(faculty.toString());
    }
    
}
