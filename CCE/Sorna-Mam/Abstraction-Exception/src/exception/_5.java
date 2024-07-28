
package exception;

public class _5 {
    public class Problem_05 {     public static void main(String[] args) {      
        try { 
            int a = 50 / 0;           
            System.out.println(a); 
        } catch (Exception e) { 
            System.out.println(e); 
        } 
         
        // catch (ArithmeticException e) { 
        // System.out.println(e); 
        // } 
 
        // Uncommenting these 3 lines will cause compile time error 
    } 
} 

    
}
