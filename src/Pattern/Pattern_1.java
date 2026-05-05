package Pattern;

public class Pattern_1 {
    static void main() {

        int n = 4;

        for(int row=1; row<=n; row++){
            // for each row -> n columns
            for (int col=1; col<=n; col++){
                // print star
                System.out.print("* ");
            }
            // Moving to Next line
            System.out.println();
        }
    }
}
