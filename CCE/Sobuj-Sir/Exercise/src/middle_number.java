
import java.util.Scanner;
public class middle_number {
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
        double a,b,c;
        System.out.println("First number=");
        a=in.nextDouble();
        System.out.println("second number=");
        b=in.nextDouble();
        System.out.println("Third number=");
        c=in.nextDouble();
        System.out.println("The sum of numbers"+mid(a,b,c));
    }
    public static double mid(double a,double b,double c)
    {
        
        return Math.min(Math.min(a, b), c);
    }
    
}
