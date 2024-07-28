
package lab_exam_sobujsir;

import java.util.Scanner;
public class _18 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long binary1,remainder,j=1;
        System.out.print("Enter the binary number=");
        binary1=in.nextLong();
        long decimal_number=0;
        while(binary1!=0)
        {
            remainder=binary1%10;
            decimal_number=(decimal_number+remainder*j);
            j=j*2;
            binary1/=10;
        }
        System.out.println("The convert binary from decimal="+decimal_number);
    }
}
