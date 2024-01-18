class Solution {
   public List<List<Integer>> combinationSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, ans , nums, target, 0,0);
    return list;
}
    public void backtrack(List<List<Integer>> list, List<Integer> ans, int[] nums, int target, int sum, int index ){
        
        if(sum> target){
            return;
        }

        if(index == nums.length){
            if(sum == target){
                list.add(new ArrayList<>(ans));
            }
            return;
        }


        sum = sum + nums[index];
        ans.add(nums[index]);
        backtrack(list,ans,nums,target,sum,index);
        ans.remove(ans.size()-1);
        sum = sum - nums[index];


        backtrack(list,ans,nums,target,sum,index+1);
    }

}