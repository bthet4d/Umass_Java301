/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;


import Exceptions_Assignment7.NoDataException;
import java.util.GregorianCalendar;

/**
 *
 * @author bryan
 */
public interface IPerson {
    
   public String getName();
   public String getAddress();
   public String getSSN();
   public GregorianCalendar getDateOfBirth();
 
   public void setName(String name) throws NoDataException;
   public void setAddress(String address);
   public void setSSN(String ssn);
   public void setDateOfBirth(GregorianCalendar dateOfBirth); 
}
