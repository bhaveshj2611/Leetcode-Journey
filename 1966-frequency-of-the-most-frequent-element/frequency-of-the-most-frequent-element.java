// class Solution {
//     public int maxFrequency(int[] nums, int k) {
        // Arrays.sort(nums);
        // int sum = 1;
        // int i=nums.length-2;
        // while(k>0 && i>=0){
             
        //         // if(nums[i+1]-nums[i]<k && nums[i+1]-nums[0]!=0  ){
        //         //     k=k-(nums[i+1]-nums[i]);
                    
        //         //     sum = sum + 1;
        //         // }
                
        //         i--;
            
        // }
        // return sum;

        import java.util.Arrays;

    

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int right = 0;
        long total = nums[0];
        long ans = 0;
        while(right<nums.length){
            
            if(total + k >= (long)nums[right] * (right - left + 1)){
                ans = Math.max(ans,right-left+1);
                right++;
                if(right<nums.length){
                    total = total + nums[right];
                }
            }
            else{
                total = total - nums[left];
                left++;
            }
            
        }
        return (int)ans;
    }
}

