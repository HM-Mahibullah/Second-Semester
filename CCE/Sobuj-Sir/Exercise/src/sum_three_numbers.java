
import java.util.Scanner;


public class sum_three_numbers {
    public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
        double a,b,c;
        System.out.println("First number=");
        a=in.nextDouble();
        System.out.println("second number=");
        b=in.nextDouble();
        System.out.println("Third number=");
        c=in.nextDouble();
        System.out.println("The sum of numbers"+sum(a,b,c));
        
    }
    public static double sum(double a,double b,double c)
    {
 double sum;
        return  sum=a+b+c; 
               
    }
    }
    

