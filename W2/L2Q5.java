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
public class L2Q5 {
    public static void main (String [] args) {
    // Declare and initialize variables
    int number, sum = 0;
    final int MAX = 10001; 
    // Create random function
    Random random = new Random();
    number = random.nextInt(MAX);
    
    // Generate random number
    System.out.printf("Your Number is: %d\n ", number); 
    
    //Calculation 
    sum += number/10000; 
    number %= 100000;
    sum += number/1000;
    number %= 1000;
    sum += number/100;
    number %= 100;
    sum += number/10;
    number %= 10;
    sum += number; 
    System.out.printf("The sum of the digit is: %2d\n", sum);
    
    }
}
