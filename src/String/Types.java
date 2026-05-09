package String;

public class Types {
    static void main() {
        // == , .equal(), .equalIgnoreCase()
        String name1 = "Abhay";
        String name2 = "Abhay";

        if (name1 == name2) {
            System.out.println("Both String are equal");
        }
        else {
            System.out.println("Both String are not equal");
        }

        String name3 = "Meow";
        String name4 = "MEOW";

        if (name3.equals(name4)) {
            System.out.println("Both String are equal");
        }
        else {
            System.out.println("Both String are not equal");
        }

        String name5 = "Ghop Ghop";
        String name6 = "GHOP GHOP";

        if (name5.equalsIgnoreCase(name6)) {
            System.out.println("Both are Equal");
        }
        else {
            System.out.println("Both are not Equal");
        }
    }
}