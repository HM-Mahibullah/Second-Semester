/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproblem_6;

/**
 *
 * @author ACER
 */
public class Q19 {
        public static void main(String[] args) {
        int a[] = {4, 5, 7, 9, 8};
        int target = 7;
        int up = a.length;
        int i;

        for (i = 0; i < up; i++) {
            if (a[i] == target) {
                System.out.println("The target " + target + " is found at position " + i);
                break; // Exit the loop once the target is found
            }
        }

        // If the loop finishes and the target is not found, you can print a message.
        if (i == up) {
            System.out.println("The target " + target + " is not found in the array.");
        }
    }
}

