class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count = 0;
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i])){
               return true;
           }
           map.put(nums[i],count);
           count++;
       }
       return false;
    }
}
