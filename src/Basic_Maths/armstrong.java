package Basic_Maths;

public class armstrong {
    static boolean isArmstrong(int num) {

        int sum = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;
            int cubeOfDigit = digit * digit * digit;
            sum = sum + cubeOfDigit;
            num = num / 10;
        }
        if (sum == original) {
            return true;
        }
        return false;
    }

    static void main() {
        System.out.println(isArmstrong(155));
    }
}
