package fop_l2;
import java.util.Random; 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abqary1907
 */
public class L2Q3 { 
    
    public static void main (String [] args) { 
    
    //Declare variables
    int num1, num2, num3; 
    final int MAX = 41; 
    Random random = new Random();
    // Generate random number
    num1 = 10 + random.nextInt(MAX); 
    num2 = 10 + random.nextInt(MAX); 
    num3 = 10 + random.nextInt(MAX); 
    // Display value 1-3 
     System.out.println("Numbers: " + num1 + ", " + num2 + ", " + num3);
    // Calculation 
     System.out.println("Sum: " + (num1+num2+num3));
     System.out.printf("Average: %.2f", ((num1+num2+num3) / 3.0));
  }
}
