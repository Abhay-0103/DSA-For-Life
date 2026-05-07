package Arrays;

public class Practice_3 {
    static void main() {
        int[] arr = {3, 4, 5, 6, 678, 8, 13};
        int n = arr.length;
        int maxValue = arr[0];

        // Compare maxValue
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > maxValue) {
                // Update the Value
                maxValue = arr[i];
            }
        }
        System.out.println("Your MaxValue is: " + maxValue);
    }
}
