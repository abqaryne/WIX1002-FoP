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
public class T4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//    // 3a. Write the statements that display the first ten values of the Fibonacci sequence. Given the formula f1 = 1, f2 =1, fn = fn-1 + fn-2.
    int f1 = 1 , f2 = 1;
    int fn = 0;  
        System.out.print(f1 + " " + f2 + " ");
        
    for (int i = 1; i <= 8; i++){
        fn = f1 + f2 ;
        System.out.print(fn + " ");
        f1 = f2; 
        f2 = fn; 
    }    
    
    }
    
}
