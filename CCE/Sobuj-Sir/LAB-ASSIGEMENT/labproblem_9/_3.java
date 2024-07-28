package labproblem_9;

import java.util.Scanner;

public class _3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string=");
        String sr=in.nextLine();
        System.out.println("The middle characters of the string="+middle(sr));
    }
    public static String middle(String sr )
    {
        int length;
        int position;// If the length of the string is odd there will be two middle characters.
        if(sr.length()%2==0)//mahi
        {
            position =sr.length()/2-1;//4/2-1=2(h)-1=1(a)
            length=2;
        }
    else//mahibul
        {
            position =sr.length()/2;//7/2=3(i)
            length=1;
        }
        return sr.substring(position, position+length);
        
    }
}