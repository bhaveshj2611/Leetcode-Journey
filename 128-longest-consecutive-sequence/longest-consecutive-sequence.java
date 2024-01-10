class Solution {
    public int longestConsecutive(int[] nums) {
      
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int ele : set){
            if(!set.contains(ele-1)){
                int count = 1;
                int x = ele;
                while(set.contains(x+1)){
                    count = count + 1;
                    x = x+1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}