package Arrays;

import java.util.Scanner;

public class Array_3 {
    static void main() {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<=n-1; i++) {
            System.out.println("Provide input for index: " + i);
            arr[i] = sc.nextInt();
        }
        // Printing
        System.out.println("Your Array Contains: ");
        for (int val: arr) {
            System.out.println(val);
        }
    }
}
