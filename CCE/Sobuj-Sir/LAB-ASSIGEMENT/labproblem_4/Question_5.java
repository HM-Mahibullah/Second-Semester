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
public class Question_5 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the seconds=");
        int b=a.nextInt();
        int c=(b/3600);
        System.out.println("The hours ="+c);
        int d=((b-(c*3600))/60);
        System.out.println("The minutes="+d);
       int e=(b-((c*3600)+(d*60)));
       System.out.println("The remaining seconds="+e);
        
        
    }
    
}
