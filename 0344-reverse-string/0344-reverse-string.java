class Solution {
    public void reverseString(char[] s) {
      String b = new StringBuilder((new String(s))).reverse().toString();
		char[] reverse = b.toCharArray();
        for ( int i = 0; i < s.length; i++) {
            s[i] = reverse[i];
        }
       
    }
}