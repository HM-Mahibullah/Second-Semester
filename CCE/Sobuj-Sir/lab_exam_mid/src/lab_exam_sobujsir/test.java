
package lab_exam_sobujsir;

import java.util.Scanner;
public class test {
        public static void main(String[] args) 
        {
          long binary1,remainder,decimal=0;
          int j=1;
          long hex []=new long[1000];
          Scanner in=new Scanner(System.in);
            System.out.print("Enter the binary number=");
          binary1=in.nextLong();
          while(binary1!=0)
          {
             remainder=(binary1%10);
             decimal=(decimal+remainder*j);
             j*=2;
             binary1/=10;
          }
            System.out.println("the decimal number="+decimal);
            int i=0;
          
          while(decimal!=0){
              hex[i]=decimal%16;
              decimal/=16;
              i++;
              }
            System.out.print("Print the Hexa_decimal number=");
            for( j=i-1;j>=0;j--)
            {
               
               if(hex[j]>9)
                    System.out.print((char)(hex[j]+55));
               else
                    System.out.print(hex[j]);
            }
            System.out.println();
              
          
          
        }

}
