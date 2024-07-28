
package searcing;
//linear search
import java.util.Arrays;
import java.util.Scanner;

public class _1 {
  public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,c;//array[]
        System.out.print("Enter total index number=");
        n=in.nextInt();
        int array[]=new int[n];//array=new int[n]
        System.out.print("Enter the number=");
        for ( c = 0; c <n; c++) {
            array[c]=in.nextInt();
        }
          Arrays.sort(array);
        System.out.println("Enter the find vslue=");
        int search=in.nextInt();
        
          for ( c = 0; c <n; c++) {
              
              if(array[c]==search)
              {
                  System.out.println(search+" Given value is find and array index is="+c);
              break;
                  
              }
        }
          if(c==n)
          {
              System.out.println("can not find value");
          }
    }
    
}
