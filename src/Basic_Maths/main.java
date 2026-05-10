package Basic_Maths;

public class main {
    static void printnumber(int num) {
        // Stop when the Number=0 ;
        // continue if not zero

        while(num !=0 ) {
            int digit = num % 10;
            System.out.println(digit);
            // last digit remove
            num = num / 10;
        }
    }

    static void main() {
        int num = 53127;
        printnumber(num);
    }
}
