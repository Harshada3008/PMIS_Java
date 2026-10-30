
import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int total = m * n;

        // Avoid unnecessary rotations
        k = k % total;

        // Create 1D array
        int[] arr = new int[total];

        // Convert 2D grid into 1D array
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[index++] = grid[i][j];
            }
        }

        // Create result grid
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {

                int oldIndex = (i * n + j - k + total) % total;

                row.add(arr[oldIndex]);
            }

            result.add(row);
        }

        return result;
    }
}
