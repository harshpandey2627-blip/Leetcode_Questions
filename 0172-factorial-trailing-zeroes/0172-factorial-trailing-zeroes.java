class Solution {
    public int trailingZeroes(int n) {
        int harsh = 0;
        while(n>0){
            n=n/5;
            harsh += n;
        }
        return harsh;
    }
}