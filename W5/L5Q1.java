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
public class L5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize and declare variables
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int average = 0, sum = 0, lowestScore = 100, highScore = 0;

        // Prompt user and initalize array
        System.out.print("Enter number of students: ");
        int number = input.nextInt();
        int[] score = new int[number];
        
        // Loop to assign value to array
        for (int i = 0; i < number; i++) {
            score[i] = random.nextInt(101);
            if (score[i] > highScore) {
                highScore = score[i];
            }

            if (score[i] < lowestScore) {
                lowestScore = score[i];
            }
            sum += score[i];
            System.out.println("");
            System.out.print(i + 1 + ". " + score[i]);
        }

        average = sum / number;

        System.out.println("");
        System.out.println("\nAverage Score: " + average);
        System.out.println("Lowest Score: " + lowestScore);
        System.out.println("Highest Score: " + highScore);

    }

}
