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
public class _3 {
      
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input the 1st number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input the 2nd number: ");
  int num2 = in.nextInt();
   
  System.out.print("Input the 3rd number: ");
  int num3 = in.nextInt();
  if(num1>num2)
  {
      if(num1>num3)
          System.out.println("the greatest number is="+num1);
  }
  if(num2>num3)
  {
      if(num2>num1)
          System.out.println("The greatest numbr is="+num2);
  }
  if(num3>num2)
  {if(num3>num1)
          System.out.println("The greatest number is="+num3);
      }
  
}
}