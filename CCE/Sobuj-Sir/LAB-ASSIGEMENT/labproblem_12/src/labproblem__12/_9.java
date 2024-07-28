/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem__12;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class _9 {
    public static void main(String[] args) {
                 String st1,st2;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first  string =");
        st1=in.nextLine();
           System.out.print("Enter the second string =");
        st2=in.nextLine();
        CharSequence cs="MD Mahibullah";
        System.out.println("Comparing " + st1 + " and " + cs + ": " + st1.contentEquals(cs));
        
     
        System.out.println("Comparing " + st2 + " and " + cs + ": " + st2.contentEquals(cs));
                 
       
       
       
    }
    
}
