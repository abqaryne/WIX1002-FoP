/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5;

/**
 *
 * @author abqary1907
 */
public class T5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Initialize string array
        String[] sentence = {"cat", "dog", "penguin", "lamb", "bird", "duck"};

        // Check array values
        for (int i = sentence.length - 1; i >= 0; i--) {
            String[] store = new String[sentence.length];
            String reversed = "";
            for (int j = sentence[i].length() - 1; j >= 0; j--) {
                reversed += "" + sentence[i].charAt(j);
                store[i] = reversed;
            }

            System.out.println("Normal word: " + sentence[i]);
            System.out.println("Reversed word: " + store[i] + "\n");
        }
    }
}
