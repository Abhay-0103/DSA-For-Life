package Basic_Maths;

public class count {
    static int countNumber(int num) {
        // Stop when the Number=0 ;
        // continue if not zero
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            count++;
            // last digit remove
            num = num / 10;
        }
        return count;
    }

    static void main() {
        int num = 531271;
        int ans = countNumber(num);
        System.out.println(ans);
    }
}
