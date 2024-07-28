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
public class _5 {
    public static void main(String[] args) {
             String st1,st2;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first  string =");
        st1=in.nextLine();
           System.out.print("Enter the second string =");
        st2=in.nextLine();
       int result = st1.compareTo(st2);
       if(result>0)
       {
           System.out.println("string_1 is greater ");
       }
         if(result<0)
       {
           System.out.println("string_2 is greater ");
       }
          if(result==0)
       {
           System.out.println("string_1 equal string_2 ");
       }
        
        
        
        
    }
}
