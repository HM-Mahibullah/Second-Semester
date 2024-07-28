
package exception;
public class _1 {
    public static void main(String[] args) {
        try
        {
        int a[]=new int[5];
        a[5]=30/5; 
        }
        catch(ArithmeticException e)
        {
            System.out.println(e+"occures");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e+"Occures");
        }
        System.out.println("Rest of the code");
      
    }
    
}
