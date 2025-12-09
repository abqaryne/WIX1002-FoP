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
public class L3Q3 {
       public static void main (String [] args ) { 
        // Declare a variable
        double sales, comission;
        Scanner input = new Scanner(System.in); 
        
        // Prompt User
           System.out.print("Enter sales: ");
           sales = input.nextDouble();
           
          if (sales > 1000) {
              comission = sales * (12.5 /100) ; 
              System.out.printf("The comission is %.2f", comission);
          }
          else if (sales >500 && sales <=1000) {
            comission = sales * (10 / 100) ; 
            System.out.printf("The comission is %.2f", comission);
          }
          else if (sales >100 && sales <=500) {
            comission = sales * (7.5 / 100) ; 
            System.out.printf("The comission is %.2f", comission);    
          }
          else {
            comission = sales * (5 / 100) ; 
            System.out.printf("The comission is %.2f", comission);
          }
    }
}

