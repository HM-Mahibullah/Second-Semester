
package labproblem__12;

import java.util.Scanner;
public class _4 {
    public static void main(String[] args) {
        String st;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string =");
        st=in.nextLine();
        int index1=st.codePointCount(10,12);

        System.out.println("The unicode from the string="+index1);
    }
    
}
