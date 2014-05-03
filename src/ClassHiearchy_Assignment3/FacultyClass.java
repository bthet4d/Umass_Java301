
package ClassHiearchy_Assignment3;

import java.util.ArrayList;


/**
 *
 * @author bryan
 */
public class FacultyClass extends OfferedClass{
    private ArrayList<Student> students = new ArrayList<>();
    
    public FacultyClass(){
        
    }
    
    public FacultyClass(float id, String n, Classroom c){
        super.setClassIdNumber(id);
        super.setClassName(n);
        super.setClassroom(c);
        
    }
    
    public ArrayList getStudent(){
        return students;
    }
    
    public void addStudent(Student s){
        students.add(s);
    }
    public String getStudentList(){
        String studentList = "";
        for(Student s: students)
        {
            studentList = studentList + " " + s.getName();
        }   
        return studentList;
    }

    @Override
    public String toString(){
       return this.getClassName() + this.getStudentList();
    }
}
