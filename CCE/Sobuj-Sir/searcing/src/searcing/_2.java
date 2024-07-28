
package searcing;
//binary searching
import java.util.Arrays;
import java.util.Scanner;

public class _2 {
     public static void binarysort(int key,int array[])
    {
         int first=0;
        int last=array.length-1;
        int mid=(first+last)/2;
        while (first<=last) {
            if(array[mid]<key)
            {
                first=mid+1;
                
            }
            else if(array[mid]==key)
            {
                System.out.println("Element is found and is index is="+mid);
                break;
            }
            else
            {
                last=mid-1;
            }
            mid=(first+last)/2;
            
            
        }
        if (first>last) {
            System.out.println("Element is not found");
            
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int array[]=new int[n];
        for (int c = 0; c < n; c++) {
            array[c]=in.nextInt();
            
        }
        Arrays.sort(array);
 
        System.out.println("Enter the searching index number=");
       int  key=in.nextInt();
        binarysort(key,array);
    
    }
}
