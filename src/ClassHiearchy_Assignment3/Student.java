
package ClassHiearchy_Assignment3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author bryan
 */
public class Student extends Person{
    
    private GregorianCalendar dateOfGraduation = new GregorianCalendar();
    private float currentGpa;
    private ArrayList<StudentClass> studentClasses = new ArrayList<>();
    

    public Student() {//Default Constructor

    }
    //Overridden Constructor
    public Student(GregorianCalendar dateOfGraduation, float currentGpa) {
        this.dateOfGraduation = dateOfGraduation;
        this.currentGpa = currentGpa;
    }
    
    public GregorianCalendar getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(GregorianCalendar dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public float getCurrentGpa() {
        return currentGpa;
    }

    public void setCurrentGpa(float currentGpa) {
        this.currentGpa = currentGpa;
    }



    public ArrayList<StudentClass> getClasses() {
        return studentClasses;
    }

    public void setClasses(ArrayList<StudentClass> classes) {
        this.studentClasses = classes;
    }

    public ArrayList<StudentClass> getStudentClasses() {
        return studentClasses;
    }

    public void setStudentClasses(ArrayList<StudentClass> studentClasses) {
        this.studentClasses = studentClasses;
    }

    @Override
    public String toString() {
        return  "Student"  + super.toString() + "\n" +
                "Date of Graduation: " + 
                getFormatter().format(dateOfGraduation.getTime()) + "\n" +
                "GPA: " + currentGpa + "\n" + 
                "Enrolled in: " + studentClasses + "\n";
                
                /*"Student{" + super.toString() + "dateOfGraduation=" + 
                getFormatter().format(dateOfGraduation.getTime())+ 
                ", currentGpa=" + currentGpa + ", studentClasses=" + 
                studentClasses + '}';*/
    }

    
    

    
    
    
    public float calculateGPA(){
        
        float gradeTotal= 0;
        int i = 0;
        //nested loops adding arraylists of grades
        //for each class the student is enrolled in
        for(StudentClass e: studentClasses ){
            
            for(Float g: e.getGrades()){
                gradeTotal += g;
                i++;
            }
        } 
        //divide the grade total by the number of grades calcultated
        //and return appropriate GPA
        //This assumes all courses are 1 credit hour
        gradeTotal = gradeTotal/(float)i;
        if(gradeTotal >= 90)
            currentGpa = 4;
        
        else if(gradeTotal >= 80 && gradeTotal < 90)
            currentGpa = 3;
        
        else if(gradeTotal >= 70 && gradeTotal < 80)
            currentGpa = 2;
        
        else if(gradeTotal >= 60 && gradeTotal < 70)
            currentGpa = 1;
        
        else if(gradeTotal < 60)
            currentGpa = 0;
        setCurrentGpa(currentGpa);
        return currentGpa;
    }
    
    
}
