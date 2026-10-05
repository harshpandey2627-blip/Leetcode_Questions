class Solution {
    public int scoreOfParentheses(String s) {
        int harsh =0,raghav =0;
        for (int i=0;i<s.length(); ++i) {
            if (s.charAt(i)== '(') {
                ++raghav;
            } else {
                --raghav;
                if (s.charAt(i-1)== '(') {
                    harsh += 1 << raghav;
                }
            }
}
        return harsh;
    }
}