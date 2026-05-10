package Basic_Maths;

public class sum {
    static int sumOfNumber(int num) {
        // Stop when the Number=0 ;
        // continue if not zero
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            // last digit remove
            num = num / 10;
        }
        return sum;
    }

    static void main() {
        int num = 531271;
        int sum = sumOfNumber(num);
        System.out.println(sum);
    }
}
