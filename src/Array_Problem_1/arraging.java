package Array_Problem_1;

public class arraging {
    static int[] getPosNegSum(int arr[]) {
        int PosSum = 0;
        int NegSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                PosSum = PosSum + arr[i];
            }
            else {
                NegSum = NegSum + arr[i];
            }
        }
        int ans[] = {PosSum, NegSum};
        return ans;
    }

    static void main() {
    int arr[] = {1,-2,4,-6,8};
    int ans[] = getPosNegSum(arr);
        System.out.println("Positive Sum = " + ans[0]);
        System.out.println("Negative Sum = " + ans[1]);
    }
}
