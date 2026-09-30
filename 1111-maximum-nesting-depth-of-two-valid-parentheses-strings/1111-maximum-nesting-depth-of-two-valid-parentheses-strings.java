class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int maxDepth = 0;
        int depth = 0;
        for (char c : seq.toCharArray()) {
            if (c == ')') {
                depth--;
                continue;
            }
            depth++;
            if (depth > maxDepth) maxDepth = depth;
        }

        int[] r = new int[n];
        int half = maxDepth >> 1;

        depth = 0;
        for (int i = 0; i < n; i++) {
            char c = seq.charAt(i);
            if (c == ')') {
                if (depth > 0) {
                    depth--;
                    continue;
                }
                r[i] = 1;
                continue;
            }
            if (depth >= half) {
                r[i] = 1;
                continue;
            }
            depth++;
        }
        return r;
    }
}