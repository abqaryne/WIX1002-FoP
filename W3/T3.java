/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l3;
import java.util.Scanner; 

/**
 *
 * @author abqary1907
 */
public class T3 {
    public static void main (String [] args) { 
        
//    //1A
//        if (3 * 8 == 27)
//            System.out.println("True");
//        else { 
//            System.out.println("False");
//        }
     
//    // 1B
//     Scanner input = new Scanner(System.in); 
     
//     // Prompt User
//     System.out.println("Input number: ");
//     int num = input.nextInt(); 
//     
//     if (num % 2 == 0) { 
//         System.out.println("Even number");
//     }
//     else 
//         System.out.println("Odd number");
//     
//     // 1C
//     char ch = 'k'; 
//     if (ch >= 'A' && ch <= 'Z') {
//         System.out.println("Capital letter");
//     }
//     else {
//         System.out.println("Non capital letter");
//                 }
//     
//     1D Display two strings in alphabetical order ignoring their case.
//        String A = "Hello";
//        String B = "Hello";
//        if (A.equalsIgnoreCase(B)) {
//            System.out.println("A is equal to B");
//        }
//        else if (A.charAt(0) < B.charAt(0)) {
//                System.out.println(A + " " + B);
//        } else {
//                System.out.println(B + " " + A);
//        }
     
//     //1E 
//     int day = 0 ; 
//     switch (day) {
//         case 0: System.out.println("Sunday"); 
//                 break;
//         case 1: System.out.println("Monday"); 
//                 break;
//         case 2: System.out.println("Tuesday"); 
//                 break;
//         case 3: System.out.println("Wednesday"); 
//                 break;
//         case 4: System.out.println("Thursday"); 
//                 break;
//         case 5: System.out.println("Friday"); 
//                 break;
//         case 6: System.out.println("Saturday"); 
//                 break;
                 
//        // 2A
//        int num1 = 0, num2 = 0;
//       
//        if (num1 == num2) 
//        System.out.println("Number 1 is equal to number 2.");
//        
//        // 2B
//        int x = 1, y = 0, z = 0;
//       
//        if (x > y && x > z)
//        System.out.println("x is the largest number");
//        
//        // 2C
//        String s1 = "Hi", s2 = "Halo";
//        
//        if (s1==s2) // Use equalsIgnoreCase to compare the value
//        System.out.println("They are equal strings.");
//        else
//        System.out.println("They are not equal strings.");
//        
//        // 2D 
//        if (x>0 || y>0);
//        System.out.println("Either x or y is positive");
        
        
//        // 3A
//          int x = 9, y = 10;
//          if (x < 10) 
//            if (y > 10)
//            System.out.println("*****");
//            else 
//            System.out.println("#####");
//            System.out.println("$$$$$"); 
        //  The output is #### and $$$$$ because the Y statement is false. If the X statement is false, $$$$ is printed because there is no {} in the else statement.       
//
//        // 3B
//        if (x < 10) {
//            if (y < 10)
//            System.out.println("*****");
//            else {
//            System.out.println("#####");
//            System.out.println("$$$$$");
//        }
//        }
//        // The output is "#####" and "$$$$$$" because else is connected with the if (y<10)  
        
//        // 3C
//        if (x < 10) {
//            if (y < 10)
//            System.out.println("*****");
//         System.out.println("#####");
//        }
//        else {
//            System.out.println("$$$$$");
//        }
//        // The output is "#####" because there is no {} in the second if


//        // 3D 
//        if (x > 10) {
//            if (y > 10) {
//                System.out.println("*****");
//                System.out.println("#####"); 
//                }  
//        else {
//            System.out.println("$$$$$");
//            }
//        } 

          // No output because "else" is inside the if (x > 10) 
        
//        // 4
//        int a, b, c ; 
//        Scanner sc = new Scanner(System.in); 
//        
//        System.out.println("Enter 3 numbers: ");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt(); 
//        
//        if (a > b && a > c) 
//            System.out.println(a + " is the biggest number ");
//        else if (b > a && b > c)
//            System.out.println(b + " is the biggest number ");
//        else
//            System.out.println(c + " is the biggest number ");

           // 5
           int year; 
           Scanner input = new Scanner (System.in); 
           
           System.out.print("Input year: ");
           year = input.nextInt();
           
           if ((year % 4 == 0) && (year % 100 != 0)) 
               System.out.println(year + " is leap year");
           else if (year % 400 == 0)
               System.out.println(year + " is leap year");
           else 
               System.out.println(year + " is not leap year");
        
     }
}
