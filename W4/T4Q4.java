/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4;
import java.util.Random; 
import java.util.Scanner; 

/**
 *
 * @author abqary1907
 */
public class T4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // 4. Write the statements that display the string in reverse order. (use String.length() to get the length of the string)
    
    // Declare variable
    Scanner input = new Scanner (System.in); 
    
    // Prompt user
        System.out.print("Enter one word: ");
        String text = input.next(); 
        System.out.println(text.length());
    
        System.out.print("Reversed version: ");
    for (int i = 1; i <= text.length(); i++){
        System.out.print(text.charAt(text.length() - i));
    }    
    System.out.println(" ");
    
    }
}
