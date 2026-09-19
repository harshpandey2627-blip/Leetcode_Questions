class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    void solve(int[] a, int target, int index,
               List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (target < 0 || index == a.length)
            return;

        list.add(a[index]);
        solve(a, target - a[index], index, list, ans);

        list.remove(list.size() - 1);
        solve(a, target, index + 1, list, ans);
    }
}