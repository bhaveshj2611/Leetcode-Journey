class Solution {
    public int findMaxLength(int[] nums) {
            Map<Integer,Integer> map = new HashMap<>();
            int max = 0;
            
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i] = -1;
                }
            }


            int sum =0;
            map.put(0,-1);
            for(int i=0;i<nums.length;i++){
                sum = sum + nums[i];
              if(!map.containsKey(sum)){
                  map.put(sum,i);
              }
              else{
                  max = Math.max(max,i-map.get(sum));
              }

            }
            // System.out.println(Arrays.toString(sum));
            return max;
    }
}