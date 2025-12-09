/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l3;
import java.util.Scanner; 

/**
 *
 * @author abqary1907
 */
public class L3Q6 {
    public static void main (String [] args) { 
        
        //Declare variable
        double radius, x, y ; 
        Scanner input = new Scanner (System.in); 
        
        // Prompt user
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        System.out.print("Enter (x,y): ");
        x = input.nextDouble(); 
        y = input.nextDouble(); 
        
        
        // Calculation
        if ( Math.pow(x, 2) + Math.pow(y, 2) < Math.pow(radius, 2)) { 
            System.out.println("The point is inside the circle");
        }
        
        else if ( Math.pow(x, 2) + Math.pow(y, 2) > Math.pow(radius, 2)) { 
            System.out.println("The point is outside the circle");
        }
        else 
            System.out.println("The point is on the circle");

        }
    }
