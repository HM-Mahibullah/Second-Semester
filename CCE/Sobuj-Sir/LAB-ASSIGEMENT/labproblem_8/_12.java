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
public class _12 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int b=1,sum=0;
        System.out.print("Enter the n seris number=");
        int n=a.nextInt();
        while(b!=n)
        {
            System.out.println(""+b);
            sum+=b;
            b++;
        }
        System.out.println("The sum of the n seris number="+sum);
        int average=sum/n;
        System.out.println("the averagr n seris number="+average);
        System.out.println(" ");
    }
 
}
