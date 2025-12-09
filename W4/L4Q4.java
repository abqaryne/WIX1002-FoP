/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4;
import java.util.Scanner ; 

/**
 *
 * @author abqary1907
 */
public class L4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    /** Q: Write a program that ask user to enter the year and the first day of the year (0 for
           Sunday, 1 for Monday, … , 6 for Saturday). Display the calendar for May and August.
    */
    
    // Declare variables
    Scanner input = new Scanner (System.in);
    int year, firstDay ;
    
    int[] dayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August"};
        
    // Prompt user
        System.out.print("Enter year: ");
        year = input.nextInt();
        
        System.out.print("Enter first day of the year (0 for sunday, 6 for saturday) : ");
        firstDay = input.nextInt();
        switch (firstDay) {
            case 0: System.out.println("Sunday is the first day of the year"); break;
            case 1: System.out.println("Monday is the first day of the year"); break;
            case 2: System.out.println("Tuesday is the first day of the year"); break;
            case 3: System.out.println("Wednesday is the first day of the year"); break;
            case 4: System.out.println("Thursday is the first day of the year"); break;
            case 5: System.out.println("Friday is the first day of the year"); break;
            case 6: System.out.println("Saturday is the first day of the year"); break;
            default: System.out.println("Invalid number of day");
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            dayInMonth[1] = 29; 
        }
        
    // Calendar
        for (int i = 0; i < 12; i++) {
            if (i == 4 || i == 7) {
                System.out.println("\n" + monthNames[i]);
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");                
                for (int j = 0; j < firstDay; j++) {
                    System.out.print("    ");
                }
                for (int day = 1; day <= dayInMonth[i]; day++ ) {
                    System.out.printf("%2d  ", day);
                    if ((day + firstDay) % 7 == 0)  {
                        System.out.println();
                    }
                }
                System.out.println("");
            }
            firstDay =  (firstDay + dayInMonth[i]) % 7 ;
        }
            
        }
    }
           
