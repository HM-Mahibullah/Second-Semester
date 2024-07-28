
package _7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
    
       
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of circle: ");
        int n=sc.nextInt();
        Area [] s=new Area[n];
        for(int i=0;i<n;i++){
            System.out.println("enter length");
            int length=sc.nextInt();
            s[i]=new Area();
            //s[i].CircleArea(length);
            System.out.println(s[i].CircleArea(length));
            
            
        System.out.println("Enter the number of re4ctangle: ");
        int c=sc.nextInt();
        Area [] C=new Area[c];
        for(int j=0;j<c;j++){
            System.out.println("enter length");
            double lengt=sc.nextDouble();
            System.out.println("enter length");
                double wedth=sc.nextDouble();
            
            C[j]=new Area();
            
            System.out.println(C[j].RectangleArea(lengt, wedth));
            
        }
        
    }
    }
}

