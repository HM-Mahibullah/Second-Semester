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
public class _2 {
    public static void main(String[] args) {
        
    
    Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number=");//1 5 1
    int a=in.nextInt();
    System.out.println("Enter the second number=");
    int b=in.nextInt();
    System.out.println("Enter the third number=");
    int c=in.nextInt();
    double discriminant=b*b-4*a*c;
    if(discriminant<=0)
    {
        System.out.println("imigenary roots");
    }
    else if(discriminant>0)
    {
        double d=Math.sqrt(discriminant);
        double e=(-b+d)/(2*a);
        double f=(-b-d)/(2*a);
        System.out.println("The first root="+e);
        System.out.println("The second root="+f);
        
    }
}
}