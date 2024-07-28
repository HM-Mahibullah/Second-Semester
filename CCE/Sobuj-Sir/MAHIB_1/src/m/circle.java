package MAHIB_1;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double radious,area;
        System.out.print("Enter the radious=");
        radious=input.nextFloat();
        area=radious*radious*3.1416;
        System.out.println("The arera of circle="+area);
        
    }
    
}
