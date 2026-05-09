package String;

import java.util.Scanner;

public class Input {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the string 1: ");
        String str = sc.nextLine();
        System.out.println("Value: " + str);

        System.out.println();

        System.out.println("Provide The String 2: ");
        String str2 = sc.next();
        System.out.println("Value of Next: " + str2);
    }
}
