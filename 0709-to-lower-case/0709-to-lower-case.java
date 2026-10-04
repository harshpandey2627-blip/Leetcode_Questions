class Solution {
    public String toLowerCase(String s) {
        char[] harsh=s.toCharArray();
        for (int i=0;i<harsh.length;i++)
            if('A'<= harsh[i] && harsh[i]<='Z')
        harsh[i]=(char) (harsh[i]-'A'+'a');
        return new String(harsh);
    }
}