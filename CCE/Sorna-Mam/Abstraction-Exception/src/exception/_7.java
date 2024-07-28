
package exception;

public class _7 {
 
    static void someMethod2() throws Exception { 
        throw new Exception("An exception"); 
    } 
 
    static void someMethod1() throws Exception {      
     //  someMethod2(); 
    } 
 
    public static void main(String[] args) 
    {      
        try { 
            someMethod2();       
        }
        catch (Exception e)
        { 
            e.printStackTrace(); 
        } 
        System.out.println("rest of the code..."); 
    } 
} 

    

