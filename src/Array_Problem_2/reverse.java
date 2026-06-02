package Array_Problem_2;

public class reverse {
    static void reverse(int arr[]){
        int i = 0;
        int j = arr.length-1;

        while(i<j){
            // Swap
            // i++
            // j--
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k: arr) {
            System.out.println(k);
        }
    }

    static void main() {
    int arr[] = {1,2,4,5,6};
    reverse(arr);
    }
}
