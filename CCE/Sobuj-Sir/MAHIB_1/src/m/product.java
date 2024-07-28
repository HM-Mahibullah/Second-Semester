
package MAHIB_1;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
      
        System.out. print("Enter the numbers=");
          a=input.nextInt();
        b=input.nextInt();
        int sum=a+b;
        int subtract=a-b;
        int divisor=a/b;
        int mod=a%b;
        int product=a*b;
        System.out.println("The product is="+sum);
        System.out.println("The product is="+subtract);
         System.out.println("The product is="+divisor);
          System.out.println("The product is="+mod);
         System.out.println("The product is="+product);
        
        
        
    }
    
}
