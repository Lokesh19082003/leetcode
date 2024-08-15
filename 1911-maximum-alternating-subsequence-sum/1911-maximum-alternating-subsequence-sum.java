import java.util.HashMap;
import java.util.Map;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        Map<String, Long> memo = new HashMap<>();
        return solve(nums, 0, n, 1, memo);
    }

    public long solve(int[] nums, int index, int n, int sign, Map<String, Long> memo) {
        if (index >= n) return 0;

        String key = index + "," + sign;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        long skip = solve(nums, index + 1, n, sign, memo);

        long value = nums[index] * sign;
        long take = value + solve(nums, index + 1, n, -sign, memo);

        long result = Math.max(skip, take);
        memo.put(key, result);
        return result;
    }
}
