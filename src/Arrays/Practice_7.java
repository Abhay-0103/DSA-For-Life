package Arrays;

public class Practice_7 {
    static void main() {
        int arr[][] = { {1,2,3}, {21,22,34} };
        int maxValue = arr[0][0];

        for (int i=0; i<= arr.length-1; i++){
            for (int j=0; j<= arr[i].length-1; j++){
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
            System.out.println("The MaxValue is: " + maxValue);
        }
    }
}
