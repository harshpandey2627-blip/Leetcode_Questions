class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder ans = new StringBuilder();

        while (num != 0) {
            int rem = num & 15;  
            ans.append(hex[rem]);
            num = num >>> 4;      
        }

        return ans.reverse().toString();
    }
}