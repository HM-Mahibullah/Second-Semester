package labproblem_4;
import java.util.Scanner;
public class Question_12
{
    public static void main(String[] args) {
        
        Scanner input=new Scanner (System.in);
        int a,b,c;
        System.out.print("ENter number=");
        a=input.nextInt();
           System.out.print("ENter number=");
        b=input.nextInt();
          System.out.print("ENter number=");
        c=input.nextInt();  
        boolean result=check(a,b,c);
        System.out.print("The result is="+result);
    }
    public static boolean check(int a,int b,int c)
    {
        if(a>=20||b>=20||c>=20)
        {
            if((a<b-c||a<c-b)||(b<a-c||b<c-a)||c<a-b||c<b-a)
            {
               return true;
            }
        }
      return false;
    }
    
}