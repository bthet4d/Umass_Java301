

package ClassHiearchy_Assignment3;

import interfaces.IPerson;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


/**
 *
 * @author bryan
 */
public class Person implements IPerson, Serializable{
    
    private String name;
    private String address;
    private String socialSecurityNumber;
    private GregorianCalendar dateOfBirth = new GregorianCalendar();
    private SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-YY");

    public Person(){
        
    }

    public Person(String name, String address, String socialSecurityNumber) {
        this.name = name;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name){

        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getSSN() {
        return socialSecurityNumber;
    }

    @Override
    public void setSSN(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public SimpleDateFormat getFormatter() {
        return formatter;
    }

    public void setFormatter(SimpleDateFormat formatter) {
        this.formatter = formatter;
    }

    @Override
    public String toString() {
        return 
                "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "SSN: " + socialSecurityNumber + "\n" + 
                "Date of Birth: " + formatter.format(dateOfBirth.getTime());
    } 
}
