

package Exceptions_Assignment7;

/**
 *
 * @author bryan
 */
public class InvalidSSN extends Exception{
    public InvalidSSN(){}
    public InvalidSSN(String message){
        super(message);
    }
}
