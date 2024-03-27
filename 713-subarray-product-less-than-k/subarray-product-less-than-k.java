class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt = 0;
        int i=0;
        int prod = 1;
        int j=0;

        if(k<=1){
            return 0;
        }

        while(j<nums.length){
            prod = prod * nums[j];

            if(prod<k){
                cnt = cnt + (j-i+1);

                j++;
            }
            else{
                while(prod>=k){
                    prod = prod / nums[i];
                     i++;
                }
                if(prod<k){
                    cnt = cnt + (j-i+1);
                }
               

                j++;
            }
        }
        return cnt;
    }
}