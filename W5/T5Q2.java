/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5;

/**
 *
 * @author abqary1907
 */
public class T5Q2 {

    /**
     * Correct the error for the following statements
     */
    
    public static void main(String[] args) {
        
    // 2a. String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};
    String [] code  = {"AAA", "AAB", "AAC", "AAD"} ; 
   
    // 2b. 
    int sum = 0; 
    int[] num = new int[10];
    for(int k=0; k < num.length; k++) 
    sum+=num[k];
    
    // 2c. 
    int[][] t = new int[3][3];
    t[1][2] = 5; 
    
    // 2d.
    int i=4;
    int []score = new int[6];
    score [1] = 78;
    score[++i] = 100;
    
   }
}
