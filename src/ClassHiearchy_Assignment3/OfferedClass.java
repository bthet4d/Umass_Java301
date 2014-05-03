
package ClassHiearchy_Assignment3;

import interfaces.IClass;
import java.io.Serializable;


/**
 *
 * @author bryan
 */
public class OfferedClass implements IClass, Serializable {
    private Classroom classroom = new Classroom();
    private String className;
    private float classIdNumber;
    
    //default constructor
    public OfferedClass(){
        className = "";
        classIdNumber = 0;
    }
    
    public OfferedClass(float i, String n, Classroom c){
        classroom = c;
        className = n;
        classIdNumber = i;
                
    }
    @Override
    public Classroom getClassroom() {
        return classroom;
    }
    
    @Override
    public void setClassroom(Classroom title) {
        this.classroom = title;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public float getClassIdNumber() {
        return classIdNumber;
    }

    @Override
    public void setClassIdNumber(float classIdNumber) {
        this.classIdNumber = classIdNumber;
    }
    

    @Override
    public String toString() {
        return "Offered Class:"+ "\n" +
                "Name: " + className + "\n" +
                "Class Id #: " + classIdNumber +
                this.getClassroom().toString() + "\n";
    }
}
