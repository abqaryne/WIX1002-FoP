package l3;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abqary1907
 */
public class L3Q5 {
    public static void main (String[]args) {
        double a, b, c, d, e, f, x, y;
        Scanner input = new Scanner(System.in) ; 
        
        // Prompt user
        System.out.print("Enter a: ");
        a = input.nextDouble(); 
        
        System.out.print("Enter b: ");        
        b = input.nextDouble(); 

        System.out.print("Enter c: ");
        c = input.nextDouble(); 
        
        System.out.print("Enter d: ");
        d = input.nextDouble(); 
        
        System.out.print("Enter e: ");
        e = input.nextDouble(); 
        
        System.out.print("Enter f: ");
        f = input.nextDouble();    
                
        // Calculation
        x = (e*d - b*f) / (a*d - b*c) ;
        y = (a*f - e*c) / (a*d - b*c) ;
        
        // If condition 
        if (a*d - b*c == 0) 
            System.out.println("This equation has no solution");
        else { 
            System.out.printf("X = %.2f ", x);            
            System.out.printf("Y = %.2f ", y);

        }
        
    }
    
}
