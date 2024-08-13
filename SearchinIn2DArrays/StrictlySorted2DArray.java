package SearchinIn2DArrays;

import java.util.Arrays;

// import java.util.Arrays;

public class StrictlySorted2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        System.out.println(Arrays.toString(search(matrix, 3)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length; // matrix may be empyt
        if (row == 1) {
            return bs(matrix, target, 0, 0, cols - 1);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = cols / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // search in 1 half
        if (target <= matrix[rStart][cMid - 1]) {
            return bs(matrix, target, rStart, 0, cMid - 1);
        }
        // search in 2 half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return bs(matrix, target, rStart, cMid + 1, cols - 1);
        }
        // search in 3 half
        if (target >= matrix[rStart + 1][cMid + 1]) {
            return bs(matrix, target, rStart + 1, 0, cMid - 1);
        } else {
            return bs(matrix, target, rStart + 1, cMid + 1, cols - 1);
        }
    }

    public static int[] bs(int[][] matrix, int target, int row, int cStart, int cEnd) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

}
