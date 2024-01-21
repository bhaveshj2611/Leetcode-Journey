class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums,0);
            return;
        }
        
        int minMax = -1;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[idx]){
                minMax = i;
                break;
            }
        }
        swap(nums,idx,minMax);
        reverse(nums,idx+1);
    }

     void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}