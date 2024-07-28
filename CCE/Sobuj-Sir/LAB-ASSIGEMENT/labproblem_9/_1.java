
package labproblem_9;

import java.util.Scanner;


public class _1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first number=");
        double a=in.nextDouble();
        
        System.out.print("Enter the second number=");
        double b=in.nextDouble();
        
        System.out.print("Enter the third number=");
        double c=in.nextDouble();
        System.out.println("The smallest number is="+smallest(a,b,c));
        
    }
     //  public static double smallest(double a, double b, double c)
   public static double smallest(double a,double b,double c)
    {
        return Math.min(Math.min(a, b), c);
    }
}
