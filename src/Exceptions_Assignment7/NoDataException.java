/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exceptions_Assignment7;

/**
 *
 * @author bryan
 */
public class NoDataException extends Exception{
    public NoDataException(){};
    public NoDataException(String message){
        super(message);
    }
    
}
