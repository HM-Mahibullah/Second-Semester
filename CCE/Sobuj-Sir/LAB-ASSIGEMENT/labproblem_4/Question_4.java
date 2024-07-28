/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_4;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Question_4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();
   int last=firstNumber%10;
   int last_1=secondNumber%10;
   int last_2=thirdNumber%10;
   boolean result=false;
   if(last==last_1 || last_1==last_2 || last_2==last)
   {
       result=true;
   }
   System.out.print("The result is="+result);
   
        
    }
    
}
