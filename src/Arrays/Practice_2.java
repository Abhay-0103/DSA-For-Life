package Arrays;

import javax.swing.*;

public class Practice_2 {
    static void main() {
        int arr[] = {2, 3, 10, 20};
        int ans = 1;
        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {
            int value = arr[i];
            ans = ans * value;
        }
        System.out.println(ans);
    }


}
