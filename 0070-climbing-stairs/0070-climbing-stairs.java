class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] x = new int[n+1];
        x[0] = x[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            x[i] = x[i-1] + x[i-2];
        }
        return x[n];
    }
}