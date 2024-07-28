
package m;

import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        
    
    Scanner input=new Scanner(System.in);
    int a;
    System.out.print("Enter  the number=");
    a=input.nextInt();
    if(a==0|| a==1)
    {
        System.out.println("Number is not prime number");
    }
    for(int i=2;i<a;i++)
    {
        if(a%i==0)
        {
           System.out.println("Number is not prime");
           break;
        }
        else
        {
            System.out.println("Number is prime");
            break;
        }
        
    }
    
    }
}
