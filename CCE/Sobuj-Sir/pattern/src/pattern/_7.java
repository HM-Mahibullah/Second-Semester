
package pattern;


public class _7 {
    public static void main(String[] args) {
        
    
    int i;
    for(i=5;i>1;i--)
    {
        for(int j=5-i;j>=0;j--)
        {
            System.out.print(" ");
        }
        for(int k=1;k<i;k++)
        {
            System.out.print("* ");
        }
          System.out.println("");
    }
  
    }
}