
package exception;


    class SomeClass { 
    public SomeClass() throws Exception { 
        throw new Exception("SomeClass constructor exception"); 
    } 
} 
 
public class _6 {   
    public static void main(String[] args) {    
        try { 
            SomeClass s= new SomeClass(); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e); 
        } 
    }
} 


