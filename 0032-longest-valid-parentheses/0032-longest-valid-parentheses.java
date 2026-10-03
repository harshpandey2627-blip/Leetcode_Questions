class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        st.push(-1);
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                st.push(i);
            }
            else {
                st.pop();
                if(st.isEmpty())
                    st.push(i);
                else
                    res = Math.max(res,i-st.peek());
            }
        }
        return res;
    }
}