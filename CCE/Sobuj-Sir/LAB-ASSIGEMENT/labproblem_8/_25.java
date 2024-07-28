
package labproblem_8;

import java.util.Scanner;
public class _25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = sc.nextInt();

        // Print the top half of the rhombus
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Print the bottom half of the rhombus
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

      //  sc.close();
    }
}


