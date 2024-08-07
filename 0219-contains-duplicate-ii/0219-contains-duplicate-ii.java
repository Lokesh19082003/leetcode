class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (numMap.containsKey(num) && Math.abs(i - numMap.get(num)) <= k) {
                return true;
            }
            numMap.put(num, i);
        }
        
        return false;
    }
}