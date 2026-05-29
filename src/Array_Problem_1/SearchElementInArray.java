package Array_Problem_1;

public class SearchElementInArray {
    static boolean findTarget(int arr[], int target) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        // Compeleted travel yet not found
        return false;
    }

    static void main() {
    int arr[] = {1,3,4,5};
    boolean ans = findTarget(arr, 50);
        System.out.println("The Target is found: " + ans);
    }
}
