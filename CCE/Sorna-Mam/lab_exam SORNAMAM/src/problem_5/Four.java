
package problem_5;

import problem_4.rectangle;
import problem_4.squre;

public class Four {
     public static void main(String[] args) {
         
 rectangle r = new rectangle(10, 20);
 System.out.println("Rectangle Area: " + r.getArea());
 System.out.println("Rectangle Perimeter: " + r.getPerimeter());

 squre[] sq = new squre[15];
 for(int i=0;i<sq.length;i++)
 {
     sq[i]=new squre(i+5);
     
 }
 for(int i=0;i<sq.length;i++)
 {
     System.out.println("Area of"+(i+1)+"square"+sq[i].getArea());  
 }
 //System.out.println("Square Area: " + sq.getArea());
 //System.out.println("Square Perimeter: " + sq.getPerimeter());
 }
 }
