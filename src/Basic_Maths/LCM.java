package Basic_Maths;

public class LCM {
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

    static int getLCM(int a, int b) {
        int gcd = getGCD(a, b);
        int prod = a*b;

        int lcm =  prod/gcd;
        return lcm;
    }

    static void main() {
        System.out.println(getLCM(18,12));
    }
}
