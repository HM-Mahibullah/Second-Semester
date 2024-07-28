/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_5;

/**
 *
 * @author ACER
 */
public class Qusetion_2 {
    
    public static void main(String[] args) {
        // Test Data
        String str1 = "kjf "; // You can change this string to test with different inputs

        // Initialize a default substitute string
        String substitute = "###";

        // Check if the input string has a length of at least 3
        if (str1.length() >= 3) {
            // Take the first three characters from the input string
            String result = str1.substring(0, 3);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Result: " + substitute);
        }
    }
}


