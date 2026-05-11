package Basic_Maths;

public class palindrome {
    static int reverseNum(int num) {
        int revNum = 0;
        // ans = ans*10 + currentDigit

        while(num !=0 ) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num/10;
        }
        return revNum;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNum = reverseNum(num);
        if (originalNum == reverseNum) {
            System.out.println("It is Palindrome");
            return true;
        }
        else {
            System.out.println("It is not Palindrome");
            return false;
        }
    }
    static void main() {
        boolean ans  = isPalindrome(1221);
        System.out.println(ans);
    }
}
