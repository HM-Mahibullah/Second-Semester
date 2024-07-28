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
public class _6 {
    public static void main(String[] args) {
        
    
    Scanner a=new Scanner(System.in);
        System.out.print("Enter the weight in inces=");
    double weight;
   
    weight=a.nextDouble();
        System.out.print("Enter the hight in inches=");
    double hight=a.nextDouble();
    double BMI=(weight*.4535)/(hight*.0254*hight*.0254);
        System.out.println("BMT is"+BMI );
}
}