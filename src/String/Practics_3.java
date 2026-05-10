package String;

public class Practics_3 {
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

    static void main() {
        String str = "Ka Ho Ka Haal Ba";
        System.out.println(getLengthOfString(str));
    }
}
