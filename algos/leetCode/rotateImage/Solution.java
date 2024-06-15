package algos.leetCode.rotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j]; // 2 // 3 // 5 // 6
                matrix[i][j] = matrix[j][i]; // 2 -> 4 // 3 -> 7 // 5 -> 5 // 6 -> 8
                matrix[j][i] = temp; // 4 -> 2 // 7 -> 3 // 5 -> 5 // 8 -> 6
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}

/**
 * Idea
 * 
 * Original
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * Swap diagonal (bottom left to to right)
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * 
 * Then, the first row and the last row
 * 7 4 1
 * 8 5 2
 * 9 6 3
 *
 * Linear
 */