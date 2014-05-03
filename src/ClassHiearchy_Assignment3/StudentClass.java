
package ClassHiearchy_Assignment3;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class StudentClass extends OfferedClass{
    private ArrayList<Float> grades = new ArrayList<>();

    //default constructor
    public StudentClass() {
    }

    //overridden constructor
    public StudentClass(float i, String n, Classroom c) {
        super(i, n, c);
    }
   
    public ArrayList<Float> getGrades() {
        
        return grades;
    }

    public void setGrades(ArrayList<Float> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return this.getClassName() + " " + "grade: " + grades;
    }
}
