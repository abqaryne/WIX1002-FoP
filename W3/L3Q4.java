/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l3;
import java.util.Random;

/**
 *
 * @author abqary1907
 */
public class L3Q4 {
    
    //Declare a variable
    public static void main (String []args) {
    int player1, player2, total1 = 0, total2 = 0; 
    Random random = new Random();
    
    // Loop function
    for (int i = 1; i < 3; i++) { 
    player1 = random.nextInt(1,7); // Set random value only from 1 to 6 
    player2 = random.nextInt(1,7); // Set random value only from 1 to 6 
    
    total1 += player1; 
    total2 += player2;
        System.out.println("ROUND " + i);
        System.out.println("Player 1: " + player1 + " | " + "Player 2: " + player2);
        System.out.println(" ");
    }
    
    // Print results
    System.out.print("Final Score: " + total1 + " | " + total2);
    
    // Calculating results    
    if (total1 > total2) {
          System.out.println(" (Player 1 win)");
      }
      else if (total2 > total1) {
          System.out.println(" (Player 2 win)");
      }
      else 
            System.out.println(" (The result is tie)");
    }
}
