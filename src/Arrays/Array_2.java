package Arrays;

public class Array_2 {
    static void main() {
        // Decalerion
        int arr[];
        // Allocation
        arr = new int[5];
        // init
        int brr[] = {10, 20, 30};

        int n = brr.length;
        // For Each Method

        for (int val: brr) {
            System.out.println(val);
        }
    }
}
