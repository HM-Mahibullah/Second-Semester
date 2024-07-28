
package labproblem_8;

import java.util.Scanner;


public class _26 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scanner.nextInt();
        
        // Number Rhombus
        System.out.println("Number Rhombus:");
      
        
        // Character Rhombus
        System.out.println("Character Rhombus:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (char j = 'A'; j < (char) ('A' + i); j++)
            {
                System.out.print(j);
            }
            for (char j = (char) ('A' + i - 2); j >= 'A'; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (char j = 'A'; j < (char) ('A' + i); j++) {
                System.out.print(j);
            }
            for (char j = (char) ('A' + i - 2); j >= 'A'; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    
    }
}

    

