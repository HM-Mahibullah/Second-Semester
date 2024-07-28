/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_4;

/**
 *
 * @author ACER
 */
  import java.util.Scanner;
public class Question_3 {
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();
        boolean result=false;
        if("".equals("true"))
        {
            result=thirdNumber>secondNumber;
        }
        else
        {
            result=secondNumber>firstNumber&&thirdNumber>secondNumber;
        }
        System.out.print("The result is="+result);
    }
}
        
   
       