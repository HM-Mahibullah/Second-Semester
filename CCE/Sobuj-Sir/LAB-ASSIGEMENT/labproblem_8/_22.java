
package labproblem_8;


public class _22 {
    public static void main(String[] args) {
        int n=5,c=1;
       for (int i = 0; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                
            
                if(i==0||j==0)
                
                    c=1;
                
                else 
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
        
            System.out.println("");
        }  
    }
}
