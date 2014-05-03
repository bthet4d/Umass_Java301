/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClassHiearchy_Assignment3;

import java.io.Serializable;

/**
 *
 * @author bryan
 */
public class Classroom implements Serializable{
    private String roomNumber;
    private char status;
    private String roomName;
    
    public Classroom (){
        this.roomNumber = "";
        this.status = 'c';
    }
    
    public Classroom (String nmb, char st){
        this.roomNumber = nmb;
        this.status = st;
    }
    
    public void setClassName(String roomName){
        this.roomName = roomName;
    }
    
    public String getClassName(){
        return roomName;
    }
    
    public void setClassroomNumber(String n){
        roomNumber = n;
    }
    
    public void setClassroomStatus(char s){
        status = s;
    }
    
    
    public String getClassroomNumber(){
        return roomNumber;
    }
    
    public char getClassroomStatus(){
        return status;
    }

    @Override
    public String toString() {
        return "Class:" + "\n" +
                "Room Number: " + roomNumber + "\n" +
                "Status: " + status + "\n";
                /*"Classroom{" + "roomNumber=" + roomNumber + ", status=" + 
                status + '}';*/
    }
    
    
    
    
}
