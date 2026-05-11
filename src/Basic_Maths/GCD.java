package Basic_Maths;

public class GCD {
    static  int getGCD(int a, int b) {
        // gcd(a,b) = gcd(b, a%b);

        while (b != 0) {
            int oldValueofb = b;
            b = a%b;
            a = oldValueofb;
        }
        // when b= 0
        int ans = a;
        return ans;
    }

    static void main() {
        System.out.println(getGCD(18,12));
    }
}
