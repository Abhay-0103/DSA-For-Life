package Pattern;

public class Pattern_9 {
    public static void main(String[] args) {
        int n = 10;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {

                if (row == 1 || row == n || col == 1 || col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // space for hollow
                }

            }
            System.out.println();
        }
    }
}