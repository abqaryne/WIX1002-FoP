/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5;

/**
 *
 * @author abqary1907
 */
public class T5Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     // Initialize string array
     String[] name = {"the", "THE", "tHE", "the"} ;
     int count = 0; 
     
     // Check array values
        for (String names : name) {
        if (names.equals("the"))
            count++ ;    
      }
     System.out.println("There is " + count + " \"the\" in the array.");
   }
}
