class Solution {
    public int firstUniqChar(String s) {
     int freq[]= new int[26];
		for(int i=0;i<s.length();i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			freq[ch-'a']++;
			
		}
		for(int i=0;i<s.length();i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			
			if(freq[ch-'a']==1) {
				return i;
			}
		}
		
		return -1;
	}
    }