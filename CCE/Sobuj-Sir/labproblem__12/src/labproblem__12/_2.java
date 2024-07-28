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
public class _2 {
    public static void main(String[] args) {
        String st;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string =");
        st=in.nextLine();
        int index1=st.charAt(2);
        int index2=st.charAt(11);
        System.out.println("The unicode from the string="+index1);
        System.out.println("The unicode from the string="+index2);
        
    }
}
