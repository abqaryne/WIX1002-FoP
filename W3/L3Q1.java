/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3;
import java.util.Scanner;

/**
 *
 * @author abqary1907
 */
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare variables
        int num1, num2, result = 0;
        char operand; 
        Scanner input = new Scanner(System.in); 
        
        // Prompt user
        System.out.print("Enter two integer: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.print("Enter operand: ");
        operand = input.next().charAt(0); 
        
        // Calculation
        if (operand == '+') { 
            result = num1 + num2;
            System.out.println(num1 + " " + operand + " " + num2 + " = " + result);

        }
        else if (operand == '-') { 
            result = num1 - num2;        
            System.out.println(num1 + " " + operand + " " + num2 + " = " + result);
        }
        else if (operand == '*') { 
            result = num1 * num2;        
            System.out.println(num1 + " " + operand + " " + num2 + " = " + result);

        }
        else if (operand == '/') { 
            result = num1 / num2;
            System.out.println(num1 + " " + operand + " " + num2 + " = " + result);

        }
        else if (operand == '%') { 
            result = num1 % num2;
            System.out.println(num1 + " " + operand + " " + num2 + " = " + result);

        }
        else 
            System.out.println("Invalid operation");
    }
    
}
