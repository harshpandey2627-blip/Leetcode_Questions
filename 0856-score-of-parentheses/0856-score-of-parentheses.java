class Solution {
    public int scoreOfParentheses(String s) {
        int harsh =0,sameer =0;
        for (int i=0;i<s.length(); ++i) {
            if (s.charAt(i)== '(') {
                ++sameer;
            } else {
                --sameer;
                if (s.charAt(i-1)== '(') {
                    harsh+= 1<<sameer;
                }}}
        return harsh;
    }
}