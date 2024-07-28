
package labproblem__12;
public class _10 {
    public static void main(String[] args) {
        String str1 = "example.com", str2 = "Example.com";
        
        // Create a StringBuffer object strbuf initialized with the value of str1.
        StringBuffer strbuf = new StringBuffer(str1);
    
        // Compare str1 and strbuf for content equality and print the result.
        System.out.println("Comparing " + str1 + " and " + strbuf + ": " + str1.contentEquals(strbuf));
    
        // Compare str2 and strbuf for content equality and print the result.
        System.out.println("Comparing " + str2 + " and " + strbuf + ": " + str2.contentEquals(strbuf));
    }
}

   
