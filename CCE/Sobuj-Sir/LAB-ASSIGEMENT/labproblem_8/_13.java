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
public class _13 {
       public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int b=1;
        System.out.print("Enter the n seris number=");
        int n=a.nextInt();
        while(b!=n)
        {
            System.out.println(b+"cube number is"+b*b*b);
             b++;
        }
}
}