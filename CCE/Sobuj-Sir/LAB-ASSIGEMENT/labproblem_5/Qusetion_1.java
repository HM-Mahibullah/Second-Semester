/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_5;

/**
 *
 * @author ACER
 */
public class Qusetion_1 {
    public static void main(String[] args) {
     

        // Test Data
        String str1 = "Python";
        String str2 = "Tutorial";


        if (str1.length() > 0 && str2.length() > 0) {

            String result = str1.substring(1) + str2.substring(1);
            
     
            System.out.println("Concatenated String: " + result);
        } else {
            System.out.println("Both input strings must have a length of at least 1.");
        }
    }
}
  
    

