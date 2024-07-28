
package exception;
public class _8 {
 
    static void another_method() { 
        try { 
            int a=1/0;
            System.out.println(a); 
        } 
        catch (ArrayIndexOutOfBoundsException e)
        { 
            System.out.println(e + " - Array Index"); 
        } 
    } 
 
    public static void main(String[] args) { 
       try { 
            try { 
                another_method();         
            } 
            catch (ArithmeticException e) 
            { 
                System.out.println(e + " - Arithmetic"); 
            } 
        }
       catch (Exception e)
       { 
           System.out.println(e + " - General"); 
       } 
    } 
} 

    
