package Array_Problem_3;

public class asending {
    static int[] sortArray(int[] arr) {
        int n = arr.length;
        int i =0;
        int j = n-1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                // swap
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0) {
                // i ko aage lejao
                i++;
            }
            if (arr[j] == 1) {
                // j ko decrement
                j--;
            }
        }
        return arr;
    }

    static void main() {

    }
}
