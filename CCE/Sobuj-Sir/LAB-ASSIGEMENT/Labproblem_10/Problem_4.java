public class Problem_4 {

    public static void main(String[] args) {
        Integer arr[] = { 15, 15, 109, 200, 30, 14, 55 };

        int sum = 0;
        for (var i : arr) {
            sum += i;
        }

        System.out.println("Average of the array: " + sum / arr.length);
    }
}