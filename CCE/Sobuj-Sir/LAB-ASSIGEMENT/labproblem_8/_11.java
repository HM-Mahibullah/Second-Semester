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
public class _11 {
    
  public static void main(String[] args)

{
   int i, n, sum=0;
   
   Scanner in = new Scanner(System.in);  
        System.out.print("Input number: ");  
         n = in.nextInt();

  System.out.println("The first n natural numbers are : "+n);
  
 for(i=1;i<=n;i++)
   {
     System.out.println(i);
     sum+=i;
   }
System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);

}
}


