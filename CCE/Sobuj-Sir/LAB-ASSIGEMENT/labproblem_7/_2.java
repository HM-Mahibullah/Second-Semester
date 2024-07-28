
package lab.problem_7;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class _2 {
  public static void main(String[] args) {
      System.out.print("Enter the inche=");
        double a;
        Scanner b=new Scanner(System.in);
        a=b.nextDouble();
        double c=.0254*a;
        System.out.println(a+"inches="+c+"meter");
}
}
