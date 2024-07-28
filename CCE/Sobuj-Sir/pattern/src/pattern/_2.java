
package pattern;

public class _2 {
    public static void main(String[] args) {
        
    
    int a,b;
    for(a=1;a<=5;a++)
    {
        for(b=2*(5-a);b>=1;b--)
        {
            System.out.print(" ");
        }
        
        for(int c=1;c<=a;c++)
        {
            System.out.print("* ");
        }
        
        System.out.print("\n");
    }
    
}
}
