class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] ans = new int [nums.length];
        int [] leftSum = new int [nums.length];
        int [] rightSum = new int [nums.length];
       int lsum=0;
      
    //    leftSum[0]=0;
       for(int i=0;i<nums.length;i++){
            leftSum[i] = lsum;
           lsum = lsum + nums[i];
             int rsum=0;
           for(int j=i+1;j<nums.length;j++){
               rsum=rsum+nums[j];
           }
           rightSum[i]=rsum;

           ans[i] = Math.abs(rightSum[i] - leftSum[i]);
       }
       return ans;
    }
    
}
