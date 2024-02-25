class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
    

        int i=0;int j=0;
        int sum = 0;
        while(j<nums.length){
            sum = sum + nums[j];
            if(sum<target){
                j++;
            }
            else if(sum >= target){
                min = Math.min(min,j-i+1);
                while(sum>=target){
                    sum = sum - nums[i];
                    i++;
                    if(sum>= target){
                        min = Math.min(min,j-i+1);
                    }
                }
                j++;
            }
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}