package l3;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abqary1907
 */
public class L3Q2 {
    // Declare variable ^
    public static void main (String [] args) {
    int number; 
    final int MAX = 6; 
    
    // Create random function
    Random random = new Random();
    number = random.nextInt(MAX);
    System.out.print(number + " is ");
    
    // Conditional logic
    switch (number) { 
        case 1: 
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break; 
        case 3:
            System.out.println("three");
            break; 
        case 4: 
            System.out.println("four");
            break; 
        case 5: 
            System.out.println("five");
            break; 
        default: 
            System.out.println("zero");                
         }
    }   
}
