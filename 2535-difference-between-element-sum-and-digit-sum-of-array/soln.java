class Solution {
    public int differenceOfSum(int[] nums) {
        
        int esum=0;
        int dsum=0;
        int value = 0;
        for(int num : nums){
            esum = esum + num;
            while(num>0){
                dsum = dsum + num%10;
                num = num/10;
            }
        }

        value = Math.abs(dsum-esum);
        return value;
    }
}
