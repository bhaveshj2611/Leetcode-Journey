class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
    
        for(int i=0;i<n;i++){
            int more = target-nums[i];
            if(map.containsKey(more)){
                result[1]=i;
                result[0]=map.get(more);
                break;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
