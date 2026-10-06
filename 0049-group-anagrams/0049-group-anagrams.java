class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

            boolean found = false;

            for (int j = 0; j < result.size(); j++) {

                if (isAnagram(strs[i], result.get(j).get(0))) {
                    result.get(j).add(strs[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(strs[i]);
                result.add(newGroup);
            }
        }

        return result;
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}