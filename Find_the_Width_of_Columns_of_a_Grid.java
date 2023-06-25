public class Find_the_Width_of_Columns_of_a_Grid {
    public int[] findColumnWidth(int[][] grid) {
        int ans[] = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int val = Integer.toString(grid[i][j]).length();
                if (ans[j] < val) {
                    ans[j] = val;
                }
            }
        }
        return ans;
    }
}
