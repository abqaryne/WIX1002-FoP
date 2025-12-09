/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4;
import java.util.Scanner ; 

/**
 *
 * @author abqary1907
 */
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // Q: Write a program that accepts an integer n from user and then sum the following series.
    
    // Declare variables
    Scanner input = new Scanner (System.in);
    int n = 0, sum = 0, total = 0;
        
    // Prompt user 
        System.out.print("Enter integer: ");
        n = input.nextInt();

    // Calculation loop
    for (int i = 1; i <= n; i++) {
        System.out.print("(");
        for (int j = 1; j <=i ; j++){ 
            System.out.print(j);
            if (j < i) System.out.print("+");
            sum += j ; 
        }
        System.out.print(")");
        if (i < n) System.out.print(" + " );
    }
        System.out.println(" = " + sum);
  }
}
