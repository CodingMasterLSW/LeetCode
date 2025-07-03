class Solution {
    public void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        Deque<Integer> deq = new ArrayDeque<>();

        for (int i=0; i<nums.length; i++) {
            deq.offer(nums[i]);
        }

        for (int i=0; i<k; i++) {
            int z = deq.pollLast();
            deq.offerFirst(z);
        }

        for (int i=0; i<nums.length; i++) {
            nums[i] = deq.poll();
        }
    }
}