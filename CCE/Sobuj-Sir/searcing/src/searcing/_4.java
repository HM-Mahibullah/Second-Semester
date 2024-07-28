
package searcing;
//bubble sorting

import java.util.Scanner;

public class _4 {
    public static void  bubblesort(int array[])
    {
        int size=array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-1; j++) {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
                }
                
                
            }
            
        }
    }
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the array element=");
        int array[]=new int[5];
        for (int i = 0; i < 5; i++) {
            array[i]=in.nextInt();
            
        }
        bubblesort(array);
        System.out.println("Sorting array is=");
        for(int num:array)
        {
        
        System.out.println(num+" ");
        }
       
        
        
    }
    
}
