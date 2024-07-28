
package m;

import java.util.Scanner;

public class fibonnaci_numbers {
    public static void main(String[] args) {
        
   
    Scanner input=new Scanner(System.in);
    int c;
    System.out.print("Enter  the seris number=");
    c=input.nextInt(); 
    
   
    int a=0,b=1,fibo;                                                                                                               
    System.out.print(a+" "+b);
    for(int i=2;i<=c;i++)
    {
        fibo=a+b;
        a=b;
        b=fibo;
        System.out.print(" "+fibo);  
                
    }
    
            System.out.println(" ");  

    
}
}