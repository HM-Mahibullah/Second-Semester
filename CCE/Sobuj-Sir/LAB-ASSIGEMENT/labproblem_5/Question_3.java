/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_5;

/**
 *
 * @author ACER
 */
public class Question_3 {

    public static void main(String[] args) {
   
        String str1 = "Python";
        String str2 = " "; //  change this string to test with different inputs


        String substitute = "#";

        
        String firstCharacterStr1 = str1.length() > 0 ? str1.substring(0, 1) : substitute;
        String lastCharacterStr1 = str1.length() > 0 ? str1.substring(str1.length() - 1) : substitute;

    
        String firstCharacterStr2 = str2.length() > 0 ? str2.substring(0, 1) : substitute;
        String lastCharacterStr2 = str2.length() > 0 ? str2.substring(str2.length() - 1) : substitute;

     
        String result = firstCharacterStr1 + lastCharacterStr1 + firstCharacterStr2 + lastCharacterStr2;

    
        System.out.println("Result: " + result);
    }
}


