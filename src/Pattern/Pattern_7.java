package Pattern;

public class Pattern_7 {
    static void main() {
        int n =4;

        for(int row=1; row<=n; row++){
            // spaces
            for (int col=1; col<=row-1; col++){
                System.out.print("  ");
        }
        // starts
        for (int col=1; col<=2*n-2*row+1; col++) {
            System.out.print("* ");
        }
            System.out.println();
        }
    }
}
