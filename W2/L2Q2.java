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
public class L2Q2 {
    
    public static void main (String [] args) { 
    
   // Declare variables
   double priceOfCar, downPayment, interestRate, loanDuration, monthlyPayment ; 
   //Create an input function
   Scanner input = new Scanner (System.in); 
   
   // Ask user to input price of the car
        System.out.print("Enter the price of the car: ");
        priceOfCar = input.nextDouble();
  // Ask user to input down payment 
        System.out.print("Enter the down payment: ");
        downPayment = input.nextDouble(); 
  // Ask user to input interest rate
        System.out.print("Enter the interest rate: ");
        interestRate = input.nextDouble();
  // Ask user to input loan duration
        System.out.print("Enter the loan duration: ");
        loanDuration = input.nextDouble();        

  // Monthly payment calculation
        monthlyPayment = (priceOfCar - downPayment) * (1 + interestRate * loanDuration/100) / (loanDuration * 12);
        System.out.printf("You have to pay RM%.2f every month.\n", monthlyPayment);
   
        
        
    }
    
}
