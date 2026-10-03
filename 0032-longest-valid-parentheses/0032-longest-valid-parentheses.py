class Solution(object):
    def longestValidParentheses(self, s):
        """
        :type s: str
        :rtype: int
        """
        st = []
        res = 0

        st.append(-1)

        for i in range(len(s)):
            if s[i] == '(':
                st.append(i)
            else:
                st.pop()

                if not st:
                    st.append(i)
                else:
                    res = max(res, i - st[-1])

        return res