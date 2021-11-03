package part2;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                if (r == c)
                    System.out.println(arr[r][c]);
            }
        }
    }
}
