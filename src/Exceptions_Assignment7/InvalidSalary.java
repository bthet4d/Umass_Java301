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
public class InvalidSalary extends Exception{
    
    public InvalidSalary(){
        
    }
    public InvalidSalary(String message){
        super(message);
    }
}