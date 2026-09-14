class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int a = 1;
        int b = x / 2;
        int ans = 1;

        while (a <= b) {
            int mid = a + (b - a) / 2;

            long sqr = (long) mid * mid;

            if (sqr == x) {
                return mid;
            } 
            else if (sqr < x) {
                ans = mid;
                a = mid + 1;
            } 
            else {
                b = mid - 1;
            }
        }

        return ans;
    }
}