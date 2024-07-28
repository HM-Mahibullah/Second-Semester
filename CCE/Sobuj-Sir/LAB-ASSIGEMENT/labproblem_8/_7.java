
package labproblem_8;

import java.util.Scanner;
public class _7 
{
    public static void main(String[] args) {
        
    String name="";
    int days=0;
    Scanner a=new Scanner(System.in);
        System.out.print("Enter the month number=");
    int b=a.nextInt();
        System.out.print("ENter the year=");
        int c=a.nextInt();
        
    switch (b)
    {
        case 1:
            name="january";
            days=31;
            break;
        case 2:
            name="February";
            if(c%400==0||c%4==0&&c%100!=0)
            {
                days=29;
                
            }
            else
                days=28;
        case 3:
            name="March";
            days=31;
            break;
        case 4:
            name="April";
            days=30;
            break;
        case 5:
            name="May";
            days=31;
            break;
        case 6:
            name="June";
            days=30;
            break;
        case 7:
            name="July";
            days=30;
            break;
        case 8:
            name="August";
            days=31;
            break;
        case 9:
            name="September";
            days=30;
            break;
        case 10:
            name="October";
            days=31;
            break;
        case 11:
            name="November";
            days=30;
            break;
        case 12:
            name="December";
            days=31;
            break;
    }
        System.out.println(" ");
        System.out.println(name+" "+c+ " is " +days+ " days.");
        System.out.println(" ");
}
}