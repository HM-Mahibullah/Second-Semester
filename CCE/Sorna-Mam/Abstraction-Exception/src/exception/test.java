
import java.util.Scanner;



public class test {
    public static void main(String[] args) 
    {
      int a;
     int c=1;
      Scanner in=new Scanner(System.in);
      a=in.nextInt();
      for(int i=0;i<a;i++)
      {
          for (int j = 0; j<=a-i; j++) {
              System.out.print(" ");
              
          }

           for (int j = 0; j <= i; j++) {
               if(i==0||j==0)
                   c=1;
               else
                   c=c*(i-j+1)/j;
               
             System.out.print(c+" ");
              
          }
          System.out.println();
          
      }
    }
}
