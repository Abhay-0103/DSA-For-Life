package Arrays;

public class Practice_4 {
    static void main() {
        int[] arr = {-5,2,30,78};
        int n = arr.length;
        int minValue = arr[0];

        for (int i=0; i<=n-1; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("Your MinValue is: " + minValue);
    }
}
