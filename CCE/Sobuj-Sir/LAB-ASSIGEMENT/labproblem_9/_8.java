package labproblem_9;

import java.util.Scanner;

public class _8
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the profit=");
        double p = in.nextDouble();
        System.out.println("Enter the years=");
        int y = in.nextInt();
        System.out.println("Enter the rate=");
        double r = in.nextDouble();
        r = r / 100;
        for (int i = 0; i <= y; i++) {
            System.out.println(i + " year is future investment= " + futureInvestmentValue(p, i, r ));
        }
    }

    public static double futureInvestmentValue(double p, int y, double r) {
        return p * Math.pow(1 + r, y );
    }
}
