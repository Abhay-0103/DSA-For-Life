package Arrays;

public class Array_4 {
    static void main() {
        int[][] arr;
        arr = new int[3][4];
        int[][] brr = {
                {1,2},
                {3,4},
                {5,6},
                {7,8}
        };
        // System.out.println(brr[3][1]);
        int rowLength = brr.length;
        int colLength = brr[0].length;

        for (int rowIndex = 0; rowIndex<=rowLength-1; rowIndex++){
            for (int colIndex=0; colIndex<=colLength-1; colIndex++){
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }
}
