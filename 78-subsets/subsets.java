class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        helper(nums, list , ans, 0);
        return ans;
    }

    static void helper(int [] nums, ArrayList<Integer> list, List<List<Integer>> ans, int index){
        if(nums.length==index){
            ans.add(new ArrayList<>(list));
            return;
        }
         list.add(nums[index]);
        helper(nums, list, ans, index+1);
        list.remove(list.size()-1);
        helper(nums, list , ans, index+1);
        
       
    }
}