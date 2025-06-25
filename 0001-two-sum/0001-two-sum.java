class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (maps.containsKey(val)) {
                return new int[]{i, maps.get(val)};
            } else {
                maps.put(nums[i], i);
            }
        }
        return null;
    }
}