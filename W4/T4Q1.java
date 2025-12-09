/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4;
import java.util.Random; 
import java.util.Scanner; 

/**
 *
 * @author abqary1907
 */
public class T4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//    // 1a. Find the largest integer n so that n3 is less than 2000.
//    
//    // Declare and initialize variable
//    int n = 0 ; 
//    double result = 0;
//    
//    // For loop 
//    for (int i = 1; Math.pow(i, 3) < 2000; i++) {
//        n = i ; 
//        result = Math.pow(n, 3);
//    }
//        //Print result
//        System.out.println("The largest integer value is " + n);
//        System.out.println("Because the result of " + n + "^3 = " + result );
        
//    // 1b. Display the square number of the first twelve integers starting from 1.
//    
//    // Declare and initialize variable 
//    double square = 0 ;  
//    int number = 0; 
//    
//    // For loop 
//    for (int i = 1; i < 13; i++) { 
//        number = i ;
//        square = number * number ;
//        System.out.println("Square of " + number + " is " + square);        
//    }
    
//    // 1c. Display a 4-by-5 matrix using random number within 0 to 100.
//    
//    // Declare variable
//    Random random = new Random(); 
//    int row = 4; 
//    int col = 5; 
//    
//    // Create an array
//    int [][] matrix = new int [row] [col];  
//    
//    // For loop 
//    for (int i = 0; i < row; i++) {
//        for (int j = 0; j < col; j++) { 
//            matrix [i][j] = random.nextInt(101); 
//            System.out.print(matrix[i][j] + "\t");
//        }
//        System.out.println();
//    } 

    
//    // 1d. Compute the sum of numbers from 1 to a given number. 
//    
//    // Declare variables
//    Scanner input = new Scanner (System.in); 
//    int sum = 0; 
//    
//    // Prompt user
//        System.out.print("Please input number: ");
//        int number = input.nextInt();
//    
//    // Calculation 
//    for (int i = 1; i <= number; i++) {
//        sum += i ; 
//        if (i < number) {
//            System.out.print(i + " + ");
//        } else { 
//            System.out.print(i + " ");
//        }
//        
//    }
//        System.out.println("= " + sum);
        
        
     // 1e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
     
     // Declare variable
     int number = 25 ; 
     double fraction = 0, sum = 0; 
     
     // Calculation 
     for (int i = 1; i <= 25; i++) {
         fraction = (double) i / number ;
         sum += fraction;
         if (i < 25) { 
             System.out.print(i + "/" + number + " + ");
         }
         else {
             System.out.print(i + "/" + number + " = "); }
         
         number-- ;
     }
        System.out.printf("%.2f\n ", sum);

    }
    
}
