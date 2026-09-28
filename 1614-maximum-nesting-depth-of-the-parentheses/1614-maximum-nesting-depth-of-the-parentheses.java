class Solution {
    public int maxDepth(String s) {
        int ans = 0, depth = 0;
        for (char ch : s.toCharArray()) {
            depth += ch == '(' ? 1 : ch == ')' ? -1 : 0;
            ans = Math.max(ans, depth);
        }
        return ans;
    }
}