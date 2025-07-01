class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            sets.add(nums[i]);
        }
        if (sets.size() != nums.length) {
            return true;
        }
        return false;
    }
}