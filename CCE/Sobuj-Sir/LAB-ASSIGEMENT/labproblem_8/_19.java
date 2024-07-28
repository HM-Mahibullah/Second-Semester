package labproblem_8;

public class _19 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            // Print spaces before the numbers
            for (int space = 1; space <= 10 - i; space++) 
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+i);
            }
              // Move to the next line
            System.out.println(" ");
            
        }
       
    }
}
