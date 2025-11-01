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
public class L2Q1 {
    
    public static void main (String [] args) { 
    // Declare double for Farhenheit and Celcius
    double fahrenheit, celcius ;
    // Create a input function
    Scanner input = new Scanner(System.in); 
    // Ask user to input farhenheit value
        System.out.print("Enter Farhenheit value: ");
        fahrenheit = input.nextDouble(); 
    // Calculation 
    celcius = (fahrenheit - 32) / 1.8 ; 
        System.out.printf("The temperature in degree celcius is: %.2f\n", celcius);    
        
        
    }
    
    
    
}
