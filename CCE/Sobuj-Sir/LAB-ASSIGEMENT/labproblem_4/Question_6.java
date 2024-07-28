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
public class Question_6 {
    
   


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int number = input.nextInt();

        int count = 0;

        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal number of factors: " + count);

        input.close();
    }
}


