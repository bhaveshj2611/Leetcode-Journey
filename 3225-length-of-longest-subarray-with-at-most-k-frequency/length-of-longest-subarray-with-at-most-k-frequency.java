class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        if(k>=nums.length){
            return nums.length;
        }
       int i=0;
       int j=0;
       int max = 0;
    Map<Integer,Integer> map = new HashMap<>();
    
       while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            
            if(map.get(nums[j]) <= k){
        
                j++;
            }
            
        
            // else if(map.get(nums[j]) == k){
            //    
            
            //     j++;
            // }
            else{
                while(map.get(nums[j]) > k){
                    map.put(nums[i],map.get(nums[i])-1);
                    i++;
                    if(map.get(nums[i]) == k){
                        max = Math.max(max,j-i+1);
                    }
                    // i++;
                }
                j++;
            }
             max = Math.max(max,j-i);
       }
       return max; 
    }
}