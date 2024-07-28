/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_6;

/**
 *
 * @author ACER
 */
public class Q118 {
        public static void main(String[] args) {
        String a = "paython";
        char target = 'o';
        int b=a.length();
        int i;
        for( i=0;i<=b;i++)
        {
           if(a.charAt(i)==target)
           {
               System.out.print("The target P position is="+i);
               break;
           }
        }
        if(i==b)
        {
            System.out.println("NOT");
        }
   
    }
}

