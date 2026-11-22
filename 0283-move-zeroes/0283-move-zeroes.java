class Solution {
    public void moveZeroes(int[] nums) {
        for (int i=1; i < nums.length; i++) {
            int idx = i;
            while (true) {
                if (idx > 0 && nums[idx-1] == 0) {
                    nums[idx-1] = nums[idx];
                    nums[idx] = 0;
                    idx--;
                } else {
                    break;
                }
            }
        }
    }
}