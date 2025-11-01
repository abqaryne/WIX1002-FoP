package fop_l2;
import java.util.Scanner; 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abqary1907
 */
public class L2Q6 {
    public static void main (String [] args) {
        // Declare variable
        double M, finTemp, iniTemp, Q; 
        Scanner input = new Scanner(System.in); 
        
        // Prompt user 
        System.out.print("Enter the amount of water in gram: ");
        M = input.nextDouble(); 
        System.out.print("Enter the initial temperature: ");
        iniTemp = input.nextDouble(); 
        System.out.print("Enter the final temperature: ");
        finTemp = input.nextDouble(); 
        
        //Calculation 
        Q = (M / 1000 ) * ((finTemp - 32) - (iniTemp - 32)) / 1.8 * 4184;
        System.out.printf("The energy needed is: %e ", Q);
        
        
    }
    
}
