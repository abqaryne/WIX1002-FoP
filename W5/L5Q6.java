/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5;

import java.util.Scanner;

/**
 *
 * @author abqary1907
 */
public class L5Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompt user and initalize array
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers of row: ");
        int numRows = input.nextInt();

        int[][] triangle = new int[numRows][];

        // For loop to assign work hours and the total for each employee. 
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }

        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", triangle[i][j]);
            }
            System.out.println();

        }
    }

}
