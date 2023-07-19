class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] ans = new int [nums.length];
        int [] leftSum = new int [nums.length];
        int [] rightSum = new int [nums.length];
   
       leftSum[0]=0;
       for(int i=1;i<nums.length;i++){
          leftSum[i]= leftSum[i-1] + nums[i-1];
           }
        rightSum[nums.length-1] = 0;
        for(int i = nums.length-2;i>=0;i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }
        
        for(int i=0;i<nums.length;i++){
            ans[i] = Math.abs(leftSum[i]-rightSum[i]);
        }

        //    ans[i] = Math.abs(lsum - rsum)/;
       
       return ans;
    }
    
}
