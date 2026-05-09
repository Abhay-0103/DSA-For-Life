package String;

public class Pattern_1 {
    static void PrintString(String str) {
        int n = str.length();
        for (int i=0; i<n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static void main() {
        String str = "Hello Babu...";
        PrintString(str);
    }
}