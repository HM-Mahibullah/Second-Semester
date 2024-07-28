/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_6;
  import java.util.*;
import java.util.*;
/**
 *
 * @author ACER
 */
public class Question_14 {
  

     public static void main(String[] arg) 
   {
	 String str = "abcdef"; 
     char[] A = str.toCharArray();
	 int offset=1;
     int len = A.length;
     offset %= len;
     reverse(A, 0, len - offset - 1);
     reverse(A, len - offset, len - 1);
     reverse(A, 0, len - 1);
     System.out.println("\n"+Arrays.toString(A));
    }

    private static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}

    

