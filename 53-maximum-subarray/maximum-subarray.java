class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];
       for(int n : nums){
           if(currSum<0){
               currSum = 0;
           }
           currSum = currSum + n;
           if(currSum > maxSum){
               maxSum = currSum;
           }
       }
       return maxSum;
    }
}