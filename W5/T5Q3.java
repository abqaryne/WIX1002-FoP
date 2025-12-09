/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5;

/**
 *
 * @author abqary1907
 */
public class T5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // 3.Determine the values of each element of array marks. Assume the array was declared as:
    int[] marks = new int [5]; // {0,0,0,0,0} 
    
     int i = 0, j = 1;
     marks[i] = 12; // marks [0 = 12] {12,0,0,0,0} 
     
     marks[j] = marks[i] + 19; 
     /* marks [1] = marks [0] + 19 
        marks [1] = 12 + 19
        marks [1] = 31 
        {12,31,0,0,0} */
     
     marks[j-1] = marks[j] * marks [j];
     /* marks [1-1] = marks [1] * marks [1]
        marks [0] = 31 * 31
        marks [0] = 961
        {961,31,0,0,0} */
     
     marks[j*3] = marks[i+1];
     /* marks [1*3] = marks [0+1]
        marks [3] = marks [1]
        marks [3] = 31
        {961,31,0,31,0} */
     
     marks[++j] = marks[i]%5;
     /* marks [1+1] = marks [0] % 5
        marks [2] = 961 % 5
        marks [2] = 1
        {961,31,1,31,0} */
     
     marks[2*j] = marks[j-1];
     /* marks [2*2] = marks [2-1]
        marks [4] = marks [1] 
        marks [4] = 31
        {961,31,1,31,31} */
   }
}
