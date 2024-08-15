class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        Long[][] memo = new Long[n][2];
        for (int i = 0; i < n; i++) Arrays.fill(memo[i], null);
        return solve(nums, 0, n, false, memo);
    }

    public static long solve(int[] nums, int index, int n, boolean signneg, Long[][] memo) {
        if (index >= n) return 0;
        if (memo[index][signneg ? 1 : 0] != null) return memo[index][signneg ? 1 : 0]; 
        //skip
        long skip = solve(nums, index + 1, n, signneg, memo);
        //take
        long value = nums[index];
        if (signneg) {
            value = -1 * value;
        }
        long take = value + solve(nums, index + 1, n, !signneg, memo);
        memo[index][signneg ? 1 : 0] = Math.max(skip, take);
        return memo[index][signneg ? 1 : 0];
    }
}