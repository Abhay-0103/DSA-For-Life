package Array_Problem_2;

public class Shift_By_1 {
    static void shiftBy1(int[] arr) {
        // 1: Store last value
        int n = arr.length;
        int temp = arr[n-1];
        // 2: Shift all value of array
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        // 3: temp value return to 0 Index
        arr[0] = temp;
    }

    static void main() {
int arr[] = {1,2,3,4,5};
shiftBy1(arr);
for (int a : arr) {
    System.out.print(a + " ");
}
        System.out.println();
    }
}
