class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;

        while (i >= 0 || k > 0) {

            if (i >= 0) {
                k += num[i];
                i--;
            }

            result.add(k % 10);
            k /= 10;
        }

        Collections.reverse(result);

        return result;
    }
}