class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
      Map<Integer,Integer> map = new HashMap<>();
   
        long sum = 0;
        long max = 0;
    
      int i=0;int j=0;
      while(j<nums.length){
          sum = sum + nums[j];
          map.put(nums[j],map.getOrDefault(nums[j],0)+1);

          if(j-i+1<k){
              j++;    
          }
          else if(j-i+1 == k){
              if(map.size() == k){
                  max = Math.max(sum,max);
              }
              
              sum = sum - nums[i];
              
              map.put(nums[i],map.get(nums[i])-1);
              if(map.get(nums[i]) == 0){
                  map.remove(nums[i]);
              }
              i++;
              j++;
          }
      }
      return max;
    }
}