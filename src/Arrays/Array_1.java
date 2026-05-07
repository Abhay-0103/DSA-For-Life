package Arrays;

public class Array_1 {
    static void main() {
        // Decalerion
        int arr[];
        // Allocation
        arr = new int[5];
        // init
        int brr[] = {10, 20, 30};

        int n = brr.length;
        for (int index = 0; index <= n - 1; index++) {
            System.out.println("The Array in Brr are: " + brr[index]);
        }
    }
}
