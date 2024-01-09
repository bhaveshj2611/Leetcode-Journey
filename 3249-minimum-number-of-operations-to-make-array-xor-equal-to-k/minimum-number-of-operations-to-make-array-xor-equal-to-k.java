class Solution {
    public int minOperations(int[] nums, int k) {
        int temp = 0;
        for(int num : nums){
            temp = temp ^ num;
        }
        // System.out.println(temp);
        int ans = 0;
        for(int i=0;i<32;i++){
            // System.out.println(temp & (1<<i));
            // System.out.println(k & (1<<i));
            if((temp & (1<<i)) != (k & (1<<i)) ){
                ans++;
            }
        }
        return ans;
    }
}