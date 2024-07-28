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
public class _4 {
    public static void main(String[] args) {
        
    
  
   
   Scanner b=new Scanner(System.in);
        System.out.print("Enter the minutes=");
    int a;
   a=b.nextInt();
   int year=a/(365*24*60);
   int remaing_munites=a%(365*24*60);
   int c=remaing_munites/(24*60);
        System.out.println("tha years is"+year+"and the days is="+c);
   
}
}