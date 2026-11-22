class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            int sum = nums[i];
            for (int j=0; j<nums.length; j++) {
                if (j == i) {
                    continue;
                }
                sum += nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                } else {
                    sum -= nums[j];
                }
            }
        }
        return null;
    }
}