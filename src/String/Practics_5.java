package String;

public class Practics_5 {
    static void PrintString(String str) {
        int n = str.length();
        for (int i=0; i<n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getLengthOfString(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }
    static int getVowelsCount(String str) {
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
        }
        return count;
    }

    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();
        for (int i=n-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    static boolean isPalindrome(String str) {
        String orginal = str;
        String reverse = reverseString(orginal);
        // Compare
        for (int i=0; i<orginal.length(); i++) {
            char ch1 = orginal.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                // No Match
                return false;
            }
        }
        // loops se out only when the char match
        return true;
    }

    static void main() {
    String str = "NooN";
        System.out.println(isPalindrome(str));
    }
}
