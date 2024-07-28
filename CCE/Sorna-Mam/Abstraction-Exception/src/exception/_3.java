package exception;

 class exceptionA extends Exception {   
        public exceptionA(String ma )
        {      
            super(ma); 
        } 
} 
 
class ExceptionB extends exceptionA { 
    public ExceptionB(String a) {        
        super(a); 
    } 
} 
 
class ExceptionC extends ExceptionB {    
    public ExceptionC(String b) {         
        super(b); 
    } 
} 
 
public class _3  {   
    public static void main(String[] args) {  
        
        try { 
            throw new ExceptionB("Exception of type ExceptonB"); 
        } 
        catch (exceptionA e) { 
            System.out.println(e); 
        } 
         try { 
            throw new ExceptionC("Exception of type ExceptonC"); 
        } 
         catch (exceptionA e) { 
            System.out.println(e); 
        } 
    } 
} 

    
    

