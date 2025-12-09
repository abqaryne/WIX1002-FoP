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
public class L5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize and declare variables
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int i = 0, temp, search;
        int[] integer = new int[20];

        // Prompt user and initalize array
        System.out.print("A list of 20 random integers within 0 - 100 \n");
        for (i = 0; i < integer.length; i++) {
            integer[i] = random.nextInt(101);
            if (i == integer.length - 1) {
                System.out.println(integer[i] + "");
            } else {
                System.out.print(integer[i] + ", ");
            }
        }
        // Bubble sort
        System.out.println("\nArray in descending order");
        for (int count = 1; count < integer.length; count++) {
            for (i = 0; i < integer.length - 1; i++) {
                if (integer[i] < integer[i + 1]) {
                    temp = integer[i];
                    integer[i] = integer[i + 1];
                    integer[i + 1] = temp;
                }
            }
        }
        // Print the sort
        i = 0;
        for (int numbers : integer) {

            if (i == integer.length - 1) {
                System.out.println(numbers + "");
            } else {
                System.out.print(numbers + ", ");
            }
            i++;
        }

        // Linear search
        System.out.println("");
        System.out.print("Enter number to search: ");
        search = input.nextInt();
        for (i = 0; i < integer.length; i++) {
            if (integer[i] == search) {
                System.out.println(search + " found!");
                System.out.println("Linear search - " + i + " loop(s)");
                break;
            } else if (i == 19 && integer[i] != search) {
                System.out.println("Linear search - Sorry, not found");
            }
        }

        // Binary search
        int low = 0, middle, high = integer.length - 1;
        for (i = 0; low <= high; i++) {
            middle = (low + high) / 2;

            if (search == integer[middle]) {
                System.out.println(search + " found!");
                System.out.println("Binary search - " + i + " loop(s)");
                break;
            } else if (search < integer[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
            if (low > high) {
                System.out.println("Binary search - Sorry, not found");
            }
        }
    }

}
