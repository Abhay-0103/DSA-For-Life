package Arrays;

public class Practice_6 {
    static void main() {
        int arr[][] = { {1,2,3}, {4,5,6}};
        int sum = 0;
        int ans = 1;

        for (int i=0; i<= arr.length-1; i++){
            for (int j=0; j<=arr[i].length-1; j++){
                int value = arr[i][j];
                ans = ans + value;
            }
        }
        System.out.println("The Answer is : "+ ans);
    }
}
