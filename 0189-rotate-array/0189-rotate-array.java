class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> deq = new ArrayDeque<>();
        for (int i=0; i<nums.length; i++) {
            deq.offer(nums[i]);
        }

        // for (k =3)
        // int last = getLastIndex()
        // deq.offer(last);
        for (int i=0; i<k; i++) {
            int current = deq.pollLast(); // point
            deq.offerFirst(current); // wrong 
        }
        for (int i=0; i<nums.length; i++) {
            nums[i] = deq.poll();
        }
    }
}