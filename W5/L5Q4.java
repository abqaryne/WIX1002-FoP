/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author abqary1907
 */
public class L5Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Random 
        Random random = new Random(); 
        // Prompt user and initalize array
        System.out.println("3 by 3 Matrix");
        int[][] matrix = new int [3][3];
        int[][] newMatrix = new int [3][3];
        int j, i, row, col;

        // For loop to assign create 3 by 3 matrix
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
        
        // For loop to rotate 
        System.out.println("");
        System.out.println("After rotates 90 degrees clockwise");
        for (row = 0; row < newMatrix.length; row++) {
            for (col = 0, i = 2; col < newMatrix.length; col++, i--) {
                newMatrix[row][col] = matrix[i][row];
                System.out.print(newMatrix[row][col] + "\t");
            }
            System.out.println("");
        }
      
    }

}
