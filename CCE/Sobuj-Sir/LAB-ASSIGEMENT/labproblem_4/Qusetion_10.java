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
public class Qusetion_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a String: ");
        String sentence = input.nextLine();
        //String[] words =sentence.split("\\s+");
         String[] words = sentence.split("\\s+");
         
        if(words.length<2)
        {
            System.out.print("NOT PENELTENUM");
        }
        else
        {
            String penultimatewords=words[words.length-2];
            System.out.print("The penultimate words is ="+penultimatewords);
        }
        
    }
        
    
}
