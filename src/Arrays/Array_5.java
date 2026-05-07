package Arrays;

public class Array_5 {
    static void main() {
        int[][] arr;
        arr = new int[3][4];
        int[][] brr = {
                {1,2},
                {2,3,5,6},
                {45,5},
                {6}
        };
        int rowlenght = brr.length;

        for (int rowIndex=0; rowIndex<=rowlenght-1; rowIndex++){
            int colLenght = brr[rowIndex].length;
            for (int colIndex=0; colIndex<=colLenght-1; colIndex++){
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }
}
