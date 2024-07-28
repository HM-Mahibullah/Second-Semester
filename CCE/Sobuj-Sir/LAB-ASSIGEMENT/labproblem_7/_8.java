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
public class _8 {
      public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = in.nextDouble();

        System.out.printf("Square: %.2f\n", val * val);
        System.out.printf("Cube: %.2f\n", val * val * val);
        System.out.printf("Fourth:%.2f\n",Math.pow(val, 4));
}
}