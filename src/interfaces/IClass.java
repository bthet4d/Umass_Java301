/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import ClassHiearchy_Assignment3.Classroom;

/**
 *
 * @author bryan
 */
public interface IClass {
    public void setClassIdNumber(float idNumber);
    public void setClassName(String title);
    public void setClassroom(Classroom room);
    
    public float getClassIdNumber();
    public String getClassName();
    public Classroom getClassroom();
    
}
