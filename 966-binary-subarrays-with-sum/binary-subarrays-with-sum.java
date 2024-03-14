class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int i=0;
       int j=0;
        int sum = 0;
        int ans = 0;
        int countZeros =0;
       while(j<nums.length){
        sum = sum + nums[j];


        while(i<j && (sum>goal || nums[i]==0)){
                    if(nums[i]==0){
                        countZeros++;
                    }
                    else{
                        countZeros=0;
                    }
                    sum = sum - nums[i];
                    i++;

                }

                
        
            if(sum == goal){
                ans = ans + 1 + countZeros;
        
            }

            j++;
            
                
            
       }
       return ans; 
    }
}