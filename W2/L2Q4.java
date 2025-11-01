/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fop_l2;
import java.util.Scanner; 
/**
 *
 * @author abqary1907
 */
public class L2Q4 {
  public static void main (String [] args) { 
    // Declare variables
    int myValue, seconds, hours, minutes; 
    // Create input function
    Scanner input = new Scanner (System.in); 
    
    // Ask user to input seconds
      System.out.print("Enter the number of seconds: ");
      myValue = input.nextInt(); 
      
    // Calculation 
    hours = myValue/3600; //60x60
    seconds = myValue%3600; 
    minutes = seconds/60; 
    seconds %= 60; 
   
    // Print output
      System.out.printf("%d Seconds is %d hours, %d minutes and %d seconds \n ", myValue, hours, minutes, seconds );
    }
}
