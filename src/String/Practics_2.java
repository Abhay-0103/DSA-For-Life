package String;

public class Practics_2 {
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

    static void main() {
        String str = "Dil Mein Kya Chipa Hai Bolo Bolo...";
        System.out.println(getLengthOfString(str));
    }
}
