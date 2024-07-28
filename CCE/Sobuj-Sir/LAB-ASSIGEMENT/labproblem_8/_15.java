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
public class _15 {
       public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int b=1,sum=0;
        System.out.print("Enter the n seris number=");
        int n=a.nextInt();
        while(n==b)
        {
            if(b%2!=0)
            {
            System.out.println(""+b);
            sum+=b;
            }
            b++;
        }
           System.out.println("The odd number sum is="+sum);
}
       }