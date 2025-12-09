/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4;
import java.util.Scanner ; 
import java.util.Random; 

/**
 *
 * @author abqary1907
 */
public class L4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /** Q: Write a simple two players dice game. Each player will take turns to roll a dice. The
           first players that reach more than 100 points win the game. If the player rolls a 6, the
           player will score 6 points and has the chance to roll again.
    */
    
    // Declare variables
    Scanner input = new Scanner (System.in);
    int player = 1 ; 
    int dice = 1, scorePlayer1 = 0, scorePlayer2 = 0, button ;
    Random random = new Random(); 
    
    for (int round = 1 ; scorePlayer1 < 100 && scorePlayer2 < 100; round++ ){
        
        // Loop dice Player 1        
        for (int roll = 1; ; roll++) {
          player = 1;
          System.out.println("Round " + round + " " + "Player " + player);
          System.out.print("Enter any number to play: ");
          button = input.nextInt(); 
          
          dice = random.nextInt(1,7);  
          System.out.println("Dice result: " + dice);
          System.out.println("");
          scorePlayer1 += dice ;
          
          if (dice == 6) {
              System.out.println("You got 6! Roll again!");
          } else {
              break;
          }
    }
        // Loop dice Player 2
        for (int roll = 1; ; roll++) {
          player = 2; 
          System.out.println("Round " + round + " " + "Player " + player);
          System.out.print("Enter any number to play: ");
          button = input.nextInt(); 
          
          dice = random.nextInt(1,7);  
          System.out.println("Dice result: " + dice);
          System.out.println("");
          scorePlayer2 += dice ;
          
          if (dice == 6) {
              System.out.println("You got 6! Roll again!");
          } else {
              break;
          }
    }
 }
        // Print results
        System.out.println("Player 1 Score: " + scorePlayer1);
        System.out.println("Player 2 Score: " + scorePlayer2);
        
        if (scorePlayer1 > scorePlayer2) {
            System.out.println("Player 1 Win!");
        } else {
            System.out.println("Player 2 Win!");
        }
    }
}
           
