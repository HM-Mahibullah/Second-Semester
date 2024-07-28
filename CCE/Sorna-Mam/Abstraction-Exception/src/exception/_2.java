
package exception;
import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
     
        try
        {
               int num=in.nextInt();
            if(num<0)
            {
               throw new  IllegalArgumentException("Number is negative");
            }
        
                  System.out.println("squre root is "+Math.sqrt(num));
        }
      
        catch(IllegalArgumentException e)
        {
            System.out.println(e);
        }
        
        
        
    }
    
}
