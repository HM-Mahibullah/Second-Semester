
package searcing;
//using recursion binary searcing

import java.util.Arrays;
import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
              System.out.print("Enter the check number=");
        int n=in.nextInt();
        
        int array[]=new int [n];
        System.out.println("Enter the array=");
        for (int c = 0; c < n; c++) {
            
        
        array[c]=in.nextInt();
        }
        Arrays.sort(array);
     
        System.out.print("Enter the check number=");
        int search=in.nextInt();
        int result=binarysearch(array,search);
        if(result!=-1)
        {
            System.out.print("Elaement is found="+result);
        }
        else 
        {
            System.out.print("Elament is not found");
        }
        
        
    }
    public static int binarysearch(int array[],int search)
    {
       int first=0; 
       int last=array.length-1; 
       while(first<=last)
       {
           int mid=(first+last)/2;
           if(array[mid]==search)
           {
              return mid; 
           }
            if(array[mid]<search) {
                first=mid+1;
           } else {
                last=mid-1;
           }
            
       }
       return -1;
    }
    
}
