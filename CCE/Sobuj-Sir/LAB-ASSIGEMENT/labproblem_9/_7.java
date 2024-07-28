package labproblem_9;

import java.util.Scanner;

public class _7
{
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the n th pentagonal nmbers= ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
       int count=1;
        for(int i=1;i<=n;i++)
        {
            System.out.printf("%-6d",sum(i));
            if(count%10==0)
            
                System.out.println(" ");
            
                count++;
            
        }
       
    }
     public static int sum(int i)
        {
            return (i*(3*i-1))/2;
        }
        
}