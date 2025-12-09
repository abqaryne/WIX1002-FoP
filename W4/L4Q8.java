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
public class L4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /** Q: Write a program that generates the first n prime number. n is an random integer
           within 0 to 100.
    */
    
    // Declare variables
    Random random = new Random ();
    int count = 0 ; 
    int number = random.nextInt(0,101);
    System.out.println("The first " + number +  " prime numbers:" );
    boolean isPrime = true; 
    
    // Loop to check prime number
    for (int i = 2; count < number; i++) {
        isPrime = true; 
        for (int j = 2; j <= i/2; j++ ){ 
            if (i % j == 0) {
                isPrime = false; 
                break;
            }
        }
           if (isPrime) {
            System.out.print(i + " ");
            count++ ;
        }
    }
  }
}

           
