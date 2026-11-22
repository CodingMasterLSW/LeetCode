class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            maps.put(nums[i], i);
        }

        for (int i=0; i<nums.length; i++) {
            int findValue = target - nums[i];
            if (maps.get(findValue) != null && maps.get(findValue) != i) {
                return new int[]{i, maps.get(findValue)};
            }
        }
        return null;

    }
}