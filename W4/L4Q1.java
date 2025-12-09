/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4;
import java.util.Scanner ; 

/**
 *
 * @author abqary1907
 */
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // Q: Write a program that accepts an integer from user. Then, display its entire factors in increasing order.
    
    // Declare variables
    Scanner input = new Scanner (System.in);
    int number ; 
    
    // Prompt user 
        System.out.print("Enter integer: ");
        number = input.nextInt();
        System.out.print("The factors: ");

    // Calculation loop
    for (int i = 1; i <= number; i++) {
        if (number % i  == 0) {
            System.out.print(i + " ");
        }  
    }
  }
}
