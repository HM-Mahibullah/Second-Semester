package labproblem__12;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
            String st;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string =");
        st=in.nextLine();
        int index1=st.codePointBefore(2);
        int index2=st.codePointBefore(11);
        System.out.println("The unicode from the string="+index1);
        System.out.println("The unicode from the string="+index2);
    }
    
}
