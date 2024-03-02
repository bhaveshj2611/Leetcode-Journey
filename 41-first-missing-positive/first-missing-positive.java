class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(j != nums[j]-1){
                return j+1;
            }
        }
        // System.out.println(Arrays.toString(nums));
        return nums.length+1;
    }
}