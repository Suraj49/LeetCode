/*
 * @lc app=leetcode id=1260 lang=java
 *
 * [1260] Shift 2D Grid
 */

// @lc code=start
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
    final int m = grid.length;
    final int n = grid[0].length;
    List<List<Integer>> ans = new ArrayList<>();
    int[][] arr = new int[m][n];

    k %= m * n;

    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j) {
        int index = (i * n + j + k) % (m * n);
        int x = index / n;
        int y = index % n;
        arr[x][y] = grid[i][j];
      }

    for (int[] row : arr)
      ans.add(Arrays.stream(row).boxed().collect(Collectors.toList()));

    return ans;
  }
}
// @lc code=end

