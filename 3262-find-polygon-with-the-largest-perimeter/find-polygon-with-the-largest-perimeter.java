class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        for(int val : nums){
            sum = sum + val;
        }

        for(int i=nums.length-1;i>=2;i--){
            // int val = nums[i];
            sum = sum - nums[i];
            if(sum > nums[i]){
                return sum + nums[i];
            }
        }
        return -1;
    }
}