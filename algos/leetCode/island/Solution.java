package algos.leetCode.island;

public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    callBFS(grid, i, j);
                }
            }
        }

        return count;
    }

    // Helper method
    // Concept : once found '1',
    // check arond nd turn any connected '1' to '0' to avoid re-count
    public void callBFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        callBFS(grid, i + 1, j); // up
        callBFS(grid, i - 1, j); // down
        callBFS(grid, i, j - 1); // left
        callBFS(grid, i, j + 1); // right
    }
}
