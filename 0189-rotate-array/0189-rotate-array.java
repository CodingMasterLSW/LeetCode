class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] result = new int[nums.length];
    
        for(int i = 0; i < nums.length; i++) {
            result[i] = nums[(nums.length - k + i) % nums.length];
        }
        System.arraycopy(result, 0, nums, 0, result.length);
    }
}