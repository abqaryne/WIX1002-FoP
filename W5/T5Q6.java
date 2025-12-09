/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package t5;
import java.util.Random ; 


/**
 *
 * @author abqary1907
 */
public class T5Q6 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     // Initialize string array
     int[] bit = new int [8] ;
     Random random = new Random(); 
     
     int number = random.nextInt(256), binary = 0, quotient = 0, division = 0 ;
     int j = bit.length - 1 ;
     String [] byt = new String[bit.length];
     
     quotient = number;
     
     while (quotient > 0) {
          binary = quotient % 2;
          quotient = quotient / 2;
          bit [j] = binary;
          j--; 
          
          if (j < 0) {
              break; 
         }
     }
        System.out.println("Decimal Number:\t"+ number);
        System.out.print("Binary Number: \t");
        for (int i = 0; i < bit.length; i++) {
         byt [i] = "" + bit[i]; 
         System.out.print(byt[i]);
     }
        System.out.println("");
    }
    
}
