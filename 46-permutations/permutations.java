class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        permutations(nums, ans, 0);
        return ans;
    }

    void permutations(int[] nums, List<List<Integer>> ans, int index) {
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            ans.add(new ArrayList<>(list));

            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            System.out.println(Arrays.toString(nums));
            permutations(nums, ans, index + 1);
            swap(nums, i, index);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}