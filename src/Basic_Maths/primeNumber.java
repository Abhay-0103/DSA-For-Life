package Basic_Maths;

public class primeNumber {
    static boolean isPrime(int num) {
        for (int i=2; i<=num-1; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    static void main() {
        int num = 11;
        System.out.println(isPrime(num));
    }
}
