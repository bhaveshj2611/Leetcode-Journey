class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int i=1;
        while(true){
            if(set.contains(i)){
                i++;
            }
            else{
                break;
            }
        }
        return i;
    }
}