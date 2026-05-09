package String;

public class Pattern_4 {
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

    static void main() {
        String str = "Abhay";
        System.out.println(reverseString(str));
    }
}
