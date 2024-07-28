
package searcing;
//insertionsort


import java.util.Scanner;



public class _6 {
    public static  void   insertionSort(int arr1[])
{
int n=arr1.length;
    for (int j = 1; j < n; j++) {
        int key=arr1[j];
        int i=j-1;
        while (i>=0&&arr1[i]>key) {
            arr1[i+1]=arr1[i];
            i--;
              // int arr1[]={2,3,1,5,4};
            //for first loop j=1 there is no change
            // for second loop j=2(index) then key=1 (value) and i=3.so exchange value {2,1,3,5,4} and again cxhaange this value {1,2,3,5,4}         
            
        }
        arr1[i+1]=key;
        
    }

}
    public static void main(String[] args) {
       // int arr1[]={2,3,1,5,4};
       
        Scanner in=new Scanner (System.in);
          System.out.print("Enter  the array total index number="); 
        int x=in.nextInt();
        int arr1[]=new int [x];
        System.out.print("Enter the array=");
        for (int i = 0; i < x; i++) {
        arr1[i]=in.nextInt();
       }
        
        System.out.println("Before Insertion Sort");    
        for(int i: arr1){    
            System.out.print(i + " ");    
        }    
        System.out.println();    
            
        insertionSort(arr1); // Sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i: arr1){    
            System.out.print(i + " ");    
        } 
        
    }
    
}
