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
public class _3 {
    public static void main(String[] args) {
        
    
    
    Scanner a=new Scanner(System.in);
int i=a.nextInt();
    if (0 <= i && i <= 1000)
    {
      int sum=0;   
        while(i>0)
        {
            int b=i%10;
           
             sum+=b;
            i/=10;
        }
        System.out.println(""+sum);
        
    }
    }
}
            
        
    
    