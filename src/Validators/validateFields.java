/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Validators;

import Exceptions_Assignment7.InvalidDate;
import Exceptions_Assignment7.InvalidSSN;
import Exceptions_Assignment7.InvalidSalary;
import Exceptions_Assignment7.NoDataException;
import java.util.GregorianCalendar;


/**
 *
 * @author bryan
 */
public class validateFields {
    public validateFields()
    {
        
    }
    
    public static void validateText(String text) throws NoDataException
    {
        if(text.isEmpty())
        {
            
            throw new NoDataException();
        }
    }
    
    public static void validateNumber(String ssn) throws InvalidSSN{
        
        if(ssn.length() != 9)
            throw new InvalidSSN();
        try{
            Integer numericSSN = Integer.parseInt(ssn);
        }
        catch(NumberFormatException e){
            throw new InvalidSSN();
    }
        
    }
    
    public static GregorianCalendar validateDate(String month, String day, 
                                          String year) throws InvalidDate{
        
        
        int intMonth;
        int intDay;
        int intYear;
        GregorianCalendar dateOf;
        try{
            intMonth = Integer.parseInt(month) - 1;
            intDay = Integer.parseInt(day);
            intYear = Integer.parseInt(year);
        }
        catch(NumberFormatException e){
            throw new InvalidDate();
                }
       
        if(intMonth > 11 || intMonth < 0)
            throw new InvalidDate();
        if(intDay > 31 || intDay <= 0)
            throw new InvalidDate();

        dateOf = new GregorianCalendar(intYear, intMonth, intDay);
        
        return dateOf;
        
    }
    public static Double validateSalary(String sal) throws InvalidSalary{
        Double salary;
        
         try{
             salary = Double.parseDouble(sal);
         
         }catch(NumberFormatException e){
             throw new InvalidSalary();
         }catch(NullPointerException e){
             throw new InvalidSalary();
         }
            return salary; 
    }
}
