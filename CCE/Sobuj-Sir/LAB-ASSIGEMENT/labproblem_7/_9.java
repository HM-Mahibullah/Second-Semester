/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.problem_7;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class _9 {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = in.nextInt();

        System.out.printf("Sum of two integers: %d\n", firstInt + secondInt);
        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
        System.out.printf("Distance of two integers=%d\n",Math.abs(firstInt-secondInt));
        System.out.printf("max number=%d\n",Math.max(firstInt, secondInt));
        System.out.printf("minimum=%d\n",Math.min(firstInt, secondInt));
        
}
}