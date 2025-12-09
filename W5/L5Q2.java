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
public class L5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize and declare variables
        Random random = new Random();
        int[] array = new int[10];
        int number;

        for (int i = 0; i < array.length; i++) {
            number = random.nextInt(21);
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (array[j] == number) {
                    isDuplicate = true;
                    break; 
                }
            }
            if (isDuplicate) {
                i--;
            } else {
                array[i] = number;
                System.out.println(array[i]);
            }
        }
            
        }
    }
