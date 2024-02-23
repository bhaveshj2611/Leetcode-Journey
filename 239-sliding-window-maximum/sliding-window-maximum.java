class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
   

    if(k>nums.length){
        int m = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            m = Math.max(m,nums[i]);
        }
        return new int[] {m};
    }

     int i=0;int j=0;
    Deque<Integer> q = new ArrayDeque<>();
    int[] ans = new int[nums.length-k+1];
    int ind = 0;
       while(j<nums.length) {
           if(q.size()==0){
            q.add(nums[j]);
           }
           else{
                while(q.size()>0 && q.peekLast()<nums[j]){
               q.removeLast();
                }
                q.add(nums[j]);
          
           }

            if(j-i+1<k){
               j++;
           }
          
           else if(j-i+1 == k){
               ans[ind] = q.peek();
               ind++;
               if(nums[i]==q.peek()){
                   q.removeFirst();
               }
               i++;
               j++;
           }

       }
       return ans;
    }
}