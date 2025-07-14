import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(new ArrayList<>(), used, nums, result);
        return result;
    }

    private void backtrack(List<Integer> current, boolean[] used, int[] nums, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(nums[i]);
                backtrack(current, used, nums, result);
                current.remove(current.size() - 1); 
                used[i] = false;
            }
        }
    }
}
