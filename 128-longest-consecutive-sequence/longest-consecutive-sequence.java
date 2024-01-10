class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int currCount = 1;
        int maxCount = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                currCount++;
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else {
                currCount = 1;
            }
            if(currCount>maxCount){
                maxCount = currCount;
            }
        }
        return maxCount;
    }
}