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

        import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int maxFrequency = 1;
        int left = 0;
        long sum = 0;

        for (int right = 1; right < nums.length; right++) {
            sum += (long) (nums[right] - nums[right - 1]) * (right - left);

            while (sum > k) {
                sum -= nums[right] - nums[left];
                left++;
            }

            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }

        return maxFrequency;
    }
}

//     }
// }