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
public class _7 {
     public static void main(String[] args) {
         Scanner a=new Scanner(System.in); 
     System.out.print("Enter the meters=");
    double meters=a.nextDouble();
    double seconds;
        System.out.print("Enter the seconds=");
  
   
    seconds=a.nextDouble();
        System.out.print("Enter the minutes=");
    double minutes=a.nextDouble();
     System.out.print("Enter the hours=");
    double hours=a.nextDouble();
    double d=meters/seconds;
       System.out.println("the speed in meters per seconds="+d);
        double c=meters/minutes;
         System.out.println("The speed is metter per minutes="+c);
       double b=meters/hours;
         System.out.println("the speed is meter per hours="+b);
        
    
    
}
}