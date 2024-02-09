class Solution {
    public void nextPermutation(int[] nums) {
    int idx = -1;
    for(int i=nums.length-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            idx = i;
            break;
        }
        
    }
    // System.out.println(idx);

    if(idx==-1){
        reverse(nums,0);
        return;
        
    }

    reverse(nums,idx+1);
    // System.out.println(Arrays.toString(nums));
    for(int i=idx+1;i<nums.length;i++){
        if(nums[i]>nums[idx]){
            swap(nums, i, idx);
             break;
        }
       
    }
    // System.out.println(Arrays.toString(nums));


    }


    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public void reverse(int[] nums,int start){
        int i= start;
        int j = nums.length-1;
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }}
    
}