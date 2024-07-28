
package lab_exam_sobujsir;
import java.util.Scanner;
public class _17 {
    public static void main(String[] args) {
long binary1,binary2;
int remainder=0,i=0;
Scanner in=new Scanner(System.in);
        System.out.print("Enter the first binary niumber=");
        binary1=in.nextLong();
        System.out.print("Enter the second binary niumber=");
        binary2=in.nextLong();
        int [] sum=new int [20];
        while (binary1!=0&&binary2!=0)
        {
            sum[i++]=(int)((binary1%10+binary2%10+remainder)%2);
            remainder=(int)((binary1%10+binary2%10+remainder)/2);
            binary1/=10;
            binary2/=10;
              }
        if(remainder!=0)
        {
            sum[i++]=remainder;
        }
        i--;
        System.out.print("sum of two binary number=");
        while(i>=0)
        {
            System.out.print(sum[i--]);
            
        }
        System.out.println(""); 
 }
}
  
 