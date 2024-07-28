
package pyramid_in_java;

public class Pyramid_in_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int[] numbers = {10, 10, 20, 10, 30, 20, 10, 20};
        
        int count10 = 0;
        int count20 = 0;
        
        for (int i : numbers) {
            if (i == 10) {
                count10++;
            } else if (i == 20) {
                count20++;
            }
        }
        
        if (count10 > count20) {
            System.out.println("The number of 10s is greater than the number of 20s.");
        } else if (count20 > count10) {
            System.out.println("The number of 20s is greater than the number of 10s.");
        } else {
            System.out.println("The number of 10s is equal to the number of 20s.");
        }
    }
}





















































































































    
    

