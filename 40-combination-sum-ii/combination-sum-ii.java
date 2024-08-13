import java.util.*;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public void generateSubsets(int[] cand, int ind, int t, List<Integer> lt, int sum) {
        if (sum == t) {
            res.add(new ArrayList<>(lt));
            return;
        }
        for (int i = ind; i < cand.length; i++) {
            // Skip duplicates
            if (i > ind && cand[i] == cand[i - 1]) continue;
            if (sum + cand[i] > t) break;  // Early stopping if sum exceeds target
            lt.add(cand[i]);
            generateSubsets(cand, i + 1, t, lt, sum + cand[i]);
            lt.remove(lt.size() - 1);  // Backtrack
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);  // Sort to handle duplicates
        generateSubsets(candidates, 0, target, new ArrayList<>(), 0);
        return res;
    }
}
