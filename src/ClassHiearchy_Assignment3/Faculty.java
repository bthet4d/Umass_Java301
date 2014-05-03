/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClassHiearchy_Assignment3;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author bryan
 */
public class Faculty extends Person{
    
    private GregorianCalendar dateOfTermination = new GregorianCalendar();
    private GregorianCalendar dateOfHire = new GregorianCalendar();
    private double salary;
    private ArrayList<FacultyClass> classes = new ArrayList();
    private char status;
    
    //Currency formatting
    private final Locale locale = new Locale("en", "US");
    private final NumberFormat nmbFormatter = NumberFormat.getCurrencyInstance(locale);
    
    
    
    //default constructor
    public Faculty(){
        this.salary = 0.0;
        this.status = 'c';//default status

    }

    public Faculty(double salary, char status) {
        this.salary = salary;
        this.status = status;
    }
    //Overridden Constructor
    //doh = date of hire

    public Faculty(GregorianCalendar doh, double salary, char status){
        this.dateOfHire = doh;
        this.salary = salary;
        this.status = status;
        
    }

    public GregorianCalendar getDateOfTermination() {
        return dateOfTermination;
    }

    public void setDateOfTermination(GregorianCalendar dateOfTermination) {
        this.dateOfTermination = dateOfTermination;
    }

    public GregorianCalendar getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(GregorianCalendar dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public String getSalary() {
        //need to format
        
        return nmbFormatter.format(salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<FacultyClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<FacultyClass> classes) {
        this.classes = classes;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    public void addClass(FacultyClass c){
        classes.add(c);
    }

    /*@Override
    public String toString() {
    return "Faculty: " + super.toString() + "Date of Termination = " +
    getFormatter().format(dateOfTermination.getTime()) +
    ", Date of Hire = " + getFormatter().format(dateOfHire.getTime()) +
    ", salary = " + getSalary ()+ ", classes = " + classes + ", status = " +
    status;
    }*/
    

    
    @Override
    public String toString() {
        return  "Faculty:" + "\n" + 
                super.toString() + "\n" +
               "Date of Hire: " + 
                getFormatter().format(dateOfHire.getTime()) + "\n" +
                "Date of Termination: " +
                getFormatter().format(dateOfTermination.getTime()) + "\n" +
                "Salary: " + salary + "\n" +
                "Classes: " + classes + "\n" +
                "Status: " + status + "\n";
                /*"Faculty{" + super.toString() + "dateOfTermination=" + 
                getFormatter().format(dateOfTermination.getTime()) + ", "
                + "dateOfHire=" + getFormatter().format(dateOfHire.getTime()) + 
                ", salary=" + salary + ", classes=" + classes + ", status=" + 
                status + '}';*/
    }
    
           
}
