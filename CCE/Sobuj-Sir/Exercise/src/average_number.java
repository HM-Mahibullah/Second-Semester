
import java.util.Scanner;

public class average_number {
     public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
        double a,b,c;
        System.out.println("First number=");
        a=in.nextDouble();
        System.out.println("second number=");
        b=in.nextDouble();
        System.out.println("Third number=");
        c=in.nextDouble();
        System.out.println("The sum of numbers"+average(a,b,c));
    }
    public static double average(double a,double b,double c)
    {
        double average=(a+b+c)/3;
        return average;
    }
    
} 

