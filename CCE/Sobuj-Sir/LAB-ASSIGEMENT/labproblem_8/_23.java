/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_8;

/**
 *
 * @author ACER
 */
public class _23 {
    public static void main(String[] args) {
        int n=5;
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
