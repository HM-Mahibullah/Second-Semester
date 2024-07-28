
package labproblem_9;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number=");
        n=in.nextInt();
        System.out.println("The sum of the numbers="+sum(n));
    }
    public static int sum(int a)
    {
         int result=0;
        while(a>0)
        {
            
        
     int n=a%10;
    
     result+=n;
     a=a/10;
     
        }
        return result;
    }
  
}
