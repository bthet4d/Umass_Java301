/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClassHiearchy_Assignment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author bryan
 */
public class DataContainer implements Serializable{
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Faculty> teachers = new ArrayList<>();
    private ArrayList<Classroom> classrooms = new ArrayList<>();
    private ArrayList<OfferedClass>  offered = new ArrayList<>();
    private FileOutputStream serializedFile = null;
    private ObjectOutputStream outFile = null;
    
    private File studentsSer = new File("students.ser");
    private File facultySer = new File("teachers.ser");
    private File classSer = new File("classrooms.ser");
    private File offeredSer = new File("offered.ser");
    

    public DataContainer() {
    }
    
    public DataContainer(ArrayList<Student> students, ArrayList<Faculty> teachers,
                         ArrayList<Classroom> classrooms, ArrayList<OfferedClass>
                         offered){
        this.students = students;
        this.teachers = teachers;
        this.classrooms = classrooms;
        this.offered = offered;
    }

    
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Faculty> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Faculty> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(ArrayList<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    public ArrayList<OfferedClass> getOffered() {
        return offered;
    }

    public void setOffered(ArrayList<OfferedClass> offered) {
        this.offered = offered;
    }

    @Override
    public String toString() {
        return "DataContainer{" + "students= " + students + ", teachers= " + 
                teachers + ", classrooms= " + classrooms + ", offered= " + 
                offered + '}';
    }
    
    
    public void serializeStudents() throws FileNotFoundException{
        
        
        try{
            serializedFile = new FileOutputStream("students.ser");
            outFile = new ObjectOutputStream(serializedFile);
            outFile.writeObject(students);
            outFile.close();
        }
        catch(Exception e)
        {
            //System.out.println("Error serializing students file");
            throw new FileNotFoundException();
        }    
    }
    
    public void serializeFaculty() throws FileNotFoundException{
        
        try{
            serializedFile = new FileOutputStream("teachers.ser");
            outFile = new ObjectOutputStream(serializedFile);
            outFile.writeObject(teachers);
            outFile.close();
        }catch(Exception e){
            //System.out.println("Error serializing teachers file.");
            throw new FileNotFoundException();
        }
    }
    
    public void serializeClassrooms () throws FileNotFoundException{
        
        try{
            serializedFile = new FileOutputStream("classrooms.ser");
            outFile = new ObjectOutputStream(serializedFile);
            outFile.writeObject(classrooms);
            outFile.close();

        }catch(Exception e){
            throw new FileNotFoundException();
        }
    }

    
    public void serializeOffered() throws FileNotFoundException{        
        try{
            serializedFile = new FileOutputStream("offered.ser");
            outFile = new ObjectOutputStream(serializedFile);
        
            outFile.writeObject(offered);
            outFile.close();
        }catch(Exception e){
            //System.out.println("Error serializing offered file.");
            throw new FileNotFoundException();
        }
    }
    
    public void deSerializeStudents() throws Exception{
        FileInputStream fis = null;
        ObjectInputStream ois = null;
       try{
            fis = new FileInputStream("students.ser");
            ois = new ObjectInputStream(fis);
            students = (ArrayList) ois.readObject();
       }catch(Exception e)
       {
           throw new Exception();
       }        
    }
        
    public void deSerializeFaculty() throws Exception{
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("teachers.ser");
            ois = new ObjectInputStream(fis);
            teachers = (ArrayList) ois.readObject();
        }catch(Exception e){
            throw new Exception();        
        }
    }
    
    public void deSerializeClassrooms() throws Exception{
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("classrooms.ser");
            ois = new ObjectInputStream(fis);
            classrooms = (ArrayList) ois.readObject();
        }catch(Exception e){
            throw new Exception();
        }
    }
    
    public void deSerializeOffered() throws Exception{
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream("offered.ser");
            ois = new ObjectInputStream(fis);
            offered = (ArrayList) ois.readObject();
        }catch(Exception e){
            throw new Exception();
        }
    }
    
    public void writeDataToTextFile(){
        FileOutputStream fos = null;
        PrintWriter dataOutput = null;
        
        try {
            fos = new FileOutputStream("out.txt");
            dataOutput = new PrintWriter(fos);
         
    } catch (IOException ioException) {
         throw new RuntimeException("Error opening output file: out.txt");
    } 

   // Write each student record to a file
   
        for (Student student : students) {
            dataOutput.println(student.toString());
        }
   
        for(Faculty faculty : teachers){
            dataOutput.println(faculty.toString());
        }
        
        /*for(Classroom classroom: classrooms){
            dataOutput.println(classroom.toString());
        }*/
        
        for(OfferedClass offeredClass: offered){
            dataOutput.println(offeredClass.toString());
        }
   
 
   // close writer
       dataOutput.close();
    }//end writeDataToFile
    
    public File getStudentsFile(){
        return studentsSer;
    }
    public File getFacultyFile(){
        return facultySer;
        
    }
    public File getClassroomsFile(){
        return classSer;
    }
    public File getOfferedFile(){
        return offeredSer;
    }
}
