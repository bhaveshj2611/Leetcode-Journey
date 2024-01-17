class Solution {
    public int maxFrequencyElements(int[] nums) {
       
        // Map<Integer,Integer> map = new HashMap<>();
        int[] freq = new int[101];
        
        for(int num : nums){
            freq[num] = freq[num] + 1;
        }

        int ans = 0;
          for (int num : freq) {
             // System.out.println(value); 
            ans = Math.max(ans,num);
        }
        // System.out.println(ans);
        
        int sol = 0;
         for (int num : freq) {
            if(ans == num){
                sol = sol + num;
            }
        }
        
               return sol;
    }
}