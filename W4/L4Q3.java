/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4;
import java.util.ArrayList;
import java.util.Scanner ; 

/**
 *
 * @author abqary1907
 */
public class L4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /** Q:Write a program that calculates the minimum, maximum, average and standard
    deviation (s) of the exam score in a subject. The program will accepts the score and
    quit if negative score is enter. A sample output is given below.
    */
    
    // Declare variables
    Scanner input = new Scanner (System.in);
    int score;
    double average = 0, deviation = 0, powerSum = 0;
    ArrayList<Integer> scores = new ArrayList<>();
    int minimum = 0, maximum = 0, sum = 0;
    
    // Calculation loop
    while (true) {
        System.out.print("Enter a score (negative score to quit): ");
        score = input.nextInt();
        if (score < 0) break; 
        scores.add(score);
    }
    
     if (scores.size() > 0) {
          minimum = scores.get(0) ; // Initilaize minimum
        maximum = scores.get(0) ; // Initilaize maximum
        
        for (int value : scores) {
            if (minimum > value ) minimum = value ;
            if (maximum < value) maximum = value;
            sum += value;
           }
        average = (double) sum / scores.size();
        
        for (int i = 0; i < scores.size(); i++) { 
          powerSum += Math.pow((scores.get(i) - average), 2) ;
        }
        deviation = Math.sqrt(powerSum / (double) (scores.size() - 1));
        
        
        System.out.println("\nMinimum score: " + minimum);
        System.out.println("Maximum score: " + maximum);
        System.out.println("Average: " + average);
        System.out.printf("Deviation: %.2f\n", deviation);

     } else {
         System.out.println("No score entered");
     }

            
        }
    }
           
