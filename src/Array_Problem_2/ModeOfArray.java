package Array_Problem_2;

import java.util.HashMap;

public class ModeOfArray {
    static int getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Checking the value is store or not
//        for (int i : freq.keySet()) {
//            // i -> Will Reperestent key
//            System.out.println(i + " -> " + freq.get(i));
//        }
        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);
            if (currentKeyKiFrequency  > maxFreq) {
                // Mujhe naya max mil gaya
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;
            }
        }
        // loop se out
        return maxFreqWaliKey;
    }

    static void main() {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5,};
        int ans = getMode(arr);
        System.out.println(ans);
    }
}
