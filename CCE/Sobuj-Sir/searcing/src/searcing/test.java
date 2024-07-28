
package searcing;
import  java.util.Calendar;

public class test {
    public static void main(String[] args) {
      Calendar c=Calendar.getInstance();
    
        // Print the formatted date (month day, year) using the specified format.
        System.out.format("%tB %te, %tY%n", c, c, c);
        
        // Print the formatted time (hour:minute am/pm) using the specified format.
        System.out.format("%tl:%tM %tp%n", c, c, c); 
        
    }
   
    }
 



