/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_8;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class _6 {
  


   


    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        double x = in.nextDouble();
        System.out.print(" another number: ");
        double y = in.nextDouble();

        //x = Math.round(x * 1000);
        x = x / 1000;

       // y = Math.round(y * 1000);
       y = y / 1000;

        if (x == y)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}


