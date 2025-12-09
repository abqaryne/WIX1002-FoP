/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5;

/**
 *
 * @author abqary1907
 */
public class T5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // 1a. Declare an array that used to store 12 floating point numbers
    float [] array  = new float [12] ; 
    
     // 1b. Initialize an array that used to store the value of A to E.
    char [] alphabet  = {'A', 'B', 'C', 'D', 'E',} ; 
    
     // 1c.  Declare an array that used to store 100 students name.
     String[] students  = new String [100]; 
     
     // 1d.  Declare an array for a table with 6 rows 2 columns that used to store integer value
     int[][] table  = new int [6] [2] ; 
     
     // 1e.  Initialize an array with the following value:
     int[][] matrix = { 
                        {6, 9}, 
                        {2, 5}, 
                        {4, 6}   } ; 
     
     // 1f.  After initialize the array, modify the value of the above array to
     matrix [1][1] = 4; 
     matrix [2][0] = 3; 
     matrix [2][1] = 7; 
     
     for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
        }
         System.out.println("");
      }
     
     // 1g.  After initialize the array, modify the value of the above array to
        String[] name = {"\nAlice ", "Bob ", "Jennifer "} ;
        for (String names : name) {
        System.out.println(names);
      }
     
   }
}
