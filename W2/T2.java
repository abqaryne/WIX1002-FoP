/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fop_l2;

import java.util.Scanner;


/**
 *
 * @author abqary1907
 */
public class T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1A. In one line using multiple Java statements
        System.out.print("Faculty ");
        System.out.print("Of ");
        System.out.print("Computer ");
        System.out.print("Science ");
        System.out.print("And ");
        System.out.print("Information ");
        System.out.print("Technology ");       
        
        //1B. In multiple lines using one Java statement
        System.out.println("Faculty\nof\nComputer\nScience\nand\nInformation\nTechnology");
        
        //2. Write a Java statement that print "SDN" - Software-defined networking
        System.out.println("\"SDN\" = Software-defined networking");
        
        //3A. System.Println("Java Programming");
        System.out.println("Java Programming");
        
        //3B. System.in.println("Introduction to Java!")
        System.out.println("Introduction to Java!");
        
        
        //3C. System.out.println("\t is the horizontal tab character");
        System.out.println("\t is the horizontal tab character");
        
        //3D. system.out.println("Java is case sensitive!" );
        System.out.println("Java is case sensitive!");
        
        //4A. Declare a variable that used to store the value of a matric number.
        String matricNumber;
        
        //4B. Initialize a variable named M with the value set to false
        double pi; 
        
        //4C. Initialize a variable named M with the value set to false.
        boolean M = false; 
        
        //4D. Initialize a variable named P with the value set to 8800000000.
        long P = 8800000000L; 
        
        //4E. Initialize a variable named letter with the value set to U.
        char letter = 'U'; 
        
        //4F. Declare a constant variable named PRO. The value of the constant variable is Java. 
        final String PRO = "Java"; 
        
        
        // 5A
        
        final double AMOUNT = 32.5;
        // AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);
       
                 
        // 5B
        String chapter = "Summary";
        System.out.println(chapter);
        
        //5C 
        int num = 0, num1 ; 
        num++; 
        num1 = num ; 
        System.out.println(num1);
        
        //5D
        double num2 = 3000; 
        System.out.printf("%4.2f\n", num2);
        
        //5E
        String contact; 
        Scanner keyboard = new Scanner(System.in);
        contact = keyboard.nextLine(); 
        
        // 6
        Scanner input = new Scanner(System.in);
        double diameter, circumference; 
        System.out.print("Please Enter Diameter: ");
        diameter = input.nextDouble(); 
        circumference = Math.PI * diameter; 
        System.out.printf("The circumference of the circle is: %4.3f\n", circumference);
        
        // 7
        Scanner k = new Scanner(System.in); 
        double inch, meters;
        System.out.print("Enter value in inch: ");
        inch = input.nextDouble(); 
        meters = inch * 2.54 / 100; 
        System.out.print(inch + " ");
        System.out.printf("inches = %.2f meters\n", meters);
        
    }
    
}
