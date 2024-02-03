class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums){
            pq.add(val);
        }

        int ele = nums.length-k;
        int i=0;
        while(i != ele){
            pq.remove();
            i++;
        }
        // System.out.println(pq.peek());
        return pq.peek();
    }
}