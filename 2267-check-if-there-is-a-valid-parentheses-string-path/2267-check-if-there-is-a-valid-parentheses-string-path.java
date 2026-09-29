class Solution {
    private char[][] grid;
    private byte[][][] memo;
    private int m, n;

    public boolean hasValidPath(char[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        int length = m + n - 1;

        if (length % 2 != 0 || grid[0][0] != '(' ||
            grid[m - 1][n - 1] != ')') {
            return false;
        }
        memo = new byte[m][n][length + 1];
        return dfs(0, 0, 0);
    }

    private boolean dfs(int row, int col, int balance) {
        balance += grid[row][col] == '(' ? 1 : -1;
        int remaining = (m - 1 - row) + (n - 1 - col);

        if (balance < 0 || balance > remaining) return false;
        if (row == m - 1 && col == n - 1) return balance == 0;

        if (memo[row][col][balance] != 0) {
            return memo[row][col][balance] == 2;
        }

        boolean possible =
            (row + 1 < m && dfs(row + 1, col, balance)) ||
            (col + 1 < n && dfs(row, col + 1, balance));

        memo[row][col][balance] = (byte) (possible ? 2 : 1);
        return possible;
    }
}