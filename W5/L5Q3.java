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
public class L5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize scanner and random
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Prompt user and initalize array
        System.out.print("Enter number of employees: ");
        int number = input.nextInt();
        System.out.println("");
        int[] workHours = new int[7];
        int[][] employee = new int[number][7];
        int[] sum = new int[number];

        // For loop to assign work hours and the total for each employee. 
        for (int i = 0; i < number; i++) {
            System.out.println("Employee " + (i + 1));
            for (int j = 0; j < workHours.length; j++) {
                workHours[j] = random.nextInt(8) + 1;
                employee[i][j] = workHours[j];
                sum[i] += workHours[j];
                System.out.println("Day " + (j + 1) + ": " + employee[i][j] + " hours");
            }
            System.out.println("Total: " + sum[i] + " hours");
            System.out.println("");
        }
    }

}
