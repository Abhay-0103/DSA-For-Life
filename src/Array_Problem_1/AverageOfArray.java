package Array_Problem_1;

public class AverageOfArray {
    static double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }
    static void main() {
        int[] arr = {2,4,3,3,5};
        System.out.println(getAverage(arr));
    }
}
