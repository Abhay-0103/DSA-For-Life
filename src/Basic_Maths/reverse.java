package Basic_Maths;

public class reverse {
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

    static void main() {
        int num = 1234;
        int revNum = reverseNum(num);
        System.out.println(revNum);
    }
}
