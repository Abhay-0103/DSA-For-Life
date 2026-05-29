package Array_Problem_1;

public class max {
    static int getmaximum(int arr[]) {
        int maxi = arr[0];

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    static void main() {
        int arr[] = {1,5,4,9,4};
        System.out.println("The Maxmimum number is: " + getmaximum(arr));
    }
}
