package Arrays;

import java.util.Scanner;

public class Practice_1 {
    static void main() {
        int arr[] = {10,20,30,40,50};
        int sum = 0;
        int n = arr.length;

        for (int i=0; i<=n-1; i++){
            int value = arr[i];
            sum = sum + value;
        }
        System.out.println(sum);
    }
}
