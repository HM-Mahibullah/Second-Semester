/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_6;

/**
 *
 * @author ACER
 */
public class Question_2 {
    public static void main(String[] args) {
        
    
    int a[]={2,3,45,10};
   boolean c1=false,c2=false;
   for(int b:a)
   {
       if(b==10)
       {
           c1=true;
       }
       else if(b==30)
       {
           c2=true;
       }
       
   }
   if(c1||c2)
   
   {
       System.out.print("TRUE");
   }
    else
   
   {
       System.out.print("false");
   }


}
}
