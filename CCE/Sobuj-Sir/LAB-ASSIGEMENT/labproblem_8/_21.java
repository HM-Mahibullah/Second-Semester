package labproblem_8;

public class _21  {
    public static void main(String[] args) {
        int n = 5;

     
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Upside-Down Pyramid
        for (int i = n; i >= 1; i--) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
