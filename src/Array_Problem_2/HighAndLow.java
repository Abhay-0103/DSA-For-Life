package Array_Problem_2;

import java.util.HashMap;

public class HighAndLow {
    static int[] getHighestLowestArray(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num  : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // HashMap is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentfreq = freq.get(key);
            if (currentfreq > highestFreq) {
                // Higest uodate
                highestFreq = currentfreq;
                highestNum = currentKey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentfreq = freq.get(key);
            if (currentfreq < lowestFreq) {
                lowestFreq = currentfreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum, lowestNum};
        return ans;
    }

    static void main() {
        int arr[] = {1,2,4,6,3,59,6};
        int ans[] = getHighestLowestArray(arr);
        System.out.println("Highest freq wala num " + ans[0]);
        System.out.println("Lowest freq wala num " + ans[1]);
    }
}
