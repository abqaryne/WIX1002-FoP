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
public class L4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /** Q: Write a program that used to calculate mortgage loan. The program will create the
           amortization table with equal total payment plan. The following are the formula and
           the sample output.
    */
    
    // Declare variables
    Scanner input = new Scanner (System.in); 
    double monthlyPayment, principal, yearlyInterest, principalPortion, interestDue, remainingBalance, totalInterest = 0, numberOfMonths;
    int month ; 
    
    // Prompt user 
        System.out.print("Enter principal amount: ");
        principal = input.nextDouble(); 
        System.out.print("Enter interest in %: ");
        yearlyInterest = input.nextDouble(); 
        System.out.print("Enter number of months: ");
        numberOfMonths = input.nextDouble();
        
        System.out.println("\nMonth  Monthly Payment  Principal  Interest  Unpaid Balance  Total Interest");
        monthlyPayment = principal * (yearlyInterest / (12*100)) / (1- Math.pow(1 + yearlyInterest/(12*100), - numberOfMonths)); 
        
    // Calculation 
     for (int i = 1; i <= numberOfMonths; i++) {
         month = i ;
         principalPortion = monthlyPayment * Math.pow(1 + yearlyInterest/(12*100), - (1 + numberOfMonths - month)); 
         interestDue = monthlyPayment - principalPortion ; 
         remainingBalance = interestDue / (yearlyInterest/(12*100)) - principalPortion;
         totalInterest += interestDue; 
         
         System.out.printf("%-5d  %-16.2f %-10.2f %-9.2f %-16.2f %-16.2f %n", month, monthlyPayment, principalPortion, interestDue, remainingBalance, totalInterest);
     }
     
       
        
    }
}
           
