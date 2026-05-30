package Array_Problem_1;

public class Unsorted {
    static int getUnsortedElement(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i+1] <= arr[i]) {
                return arr[i+1];
            }
        }
        return -1;
    }

    static void main() {
    int arr[] = {1,2,5,4,9};
        System.out.println(getUnsortedElement(arr));
    }
}
