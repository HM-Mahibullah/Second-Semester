
package labproblem_8;

import java.util.Scanner;
public class _5 {
      public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input the 1st number: ");
  int num1 = in.nextInt();
  if(num1>0&&num1<8)
  {
      switch(num1)
      {
          case 1:
              System.out.println("saturday");
              break;
          case 2:
              System.out.println("sunday");
              break;
          case 3:
              System.out.println("Monday");
              break;
          case 4:
              System.out.println("Tuesday");
              break;
          case 5:
              System.out.println("wednesday");
              break;
          case 6:
              System.out.println("Thuesday");
              break;
          case 7:
              System.out.println("Friday");
              break;
          default:
              System.out.println("Enter the number press again");
                      
                      
      }
  }
  
}
}
