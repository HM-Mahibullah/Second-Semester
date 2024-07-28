/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_4;
 import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Question_11 {
   


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a word: ");
        String word = input.nextLine();

        // Create a StringBuilder to reverse the word
        StringBuilder Wor = new StringBuilder(word);
        Wor.reverse();

        System.out.println("Reverse word: " + Wor.toString());

     
    }
}

    

