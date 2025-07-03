class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] result = new int[nums.length];
        // result 형성

        // k = 3
        // 0 1 2 3 4 5 6
        // 1 2 3 4 5 6 7

        // 5 6 7 1 2 3 4

        // 시작 (length - k + i) % length

        for(int i = 0; i < nums.length; i++) {
            result[i] = nums[(nums.length - k + i) % nums.length];
        }

        // result 완성, 아래 펑션 헷갈림 -> 테스트 필요
        System.arraycopy(result, 0, nums, 0, result.length);
    }
}