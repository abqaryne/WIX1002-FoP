/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4;
import java.util.Scanner ; 
import java.util.Random; 

/**
 *
 * @author abqary1907
 */
public class L4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /** Q: Write a program that generates a non-negative random integer. Display the number of
           digits in the integer.
    */
    
    // Declare variables
    Random random = new Random ();
    int number = Math.abs(random.nextInt());
    int length = String.valueOf(number).length(); 
    
        System.out.println(number + " is " + length + " digits." );
    }
}
           
