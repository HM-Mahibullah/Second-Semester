package labproblem_9;
import java.util.Scanner;

public class _4
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();

        System.out.print("Number of Vowels in the string: " + countVowels(str) + "\n");
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase to make the comparison case-insensitive
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
