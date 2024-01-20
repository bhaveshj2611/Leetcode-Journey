class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(nums,list,ans,0);
        return ans;
    }

    static void helper(int[] nums, List<Integer> list, List<List<Integer>> ans, int index){
        if(index==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        // int num = nums[index];
       
        helper(nums,list,ans,index+1);
        list.add(nums[index]);
        helper(nums,list,ans,index+1);
        list.remove(list.size()-1);
    }
}