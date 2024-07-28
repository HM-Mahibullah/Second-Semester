
package searcing;
//Searching short.
import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {

        Scanner in=new Scanner (System.in);
        System.out.print("Enter  the array total index number="); 
        int x=in.nextInt();
        int array[]=new int [x];
        System.out.print("Enter the array=");
        for (int i = 0; i < x; i++) {
        array[i]=in.nextInt();
       }
             for (int i = 0; i < x; i++) {
                 for (int j = i+1; j < x; j++) {
                     if(array[i]>array[j])// if(array[i]<array[j]) which statement [ < ] is used then the sorting array is greater to less(2 1 7)to(7 2 1).
                     {
                         int temp=array[i];
                         array[i]=array[j];
                         array[j]=temp;
                     
                 }
           
                
            
        }
             System.out.print("The searchin array is =");
                 for(int n:array)
                 {
                     System.out.print(n+" ");
                 }   
      
        
        
    }
    
    }
}
