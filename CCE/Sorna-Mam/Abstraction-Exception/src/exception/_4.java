
package exception;
import java.io.IOException; 
 
class ExceptionA extends Exception {  
    public ExceptionA(String m) {     
        super(m); 
    } 
} 
 
class ExceptionB extends ExceptionA {  
    public ExceptionB(String message) {       
        super(message); 
    } 
} 
 
public class _4 {    
    public static void main(String[] args) {     
    try { 
            throw new ExceptionA("Exception type A"); 
        }
 catch (ExceptionA e) { 
            System.out.println(e); 
        }    
    try { 
            throw new ExceptionB("Exception type B"); 
        } 
catch (ExceptionB e) { 
            System.out.println(e); 
        }       
    try { 
            throw new NullPointerException("Null pointer exception"); 
        }
 catch (Exception n) { 
            System.out.println(n); 
        }
    

   try { 
            throw new IOException("IO Exception"); 
        } 
     catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
}
    

 


    

