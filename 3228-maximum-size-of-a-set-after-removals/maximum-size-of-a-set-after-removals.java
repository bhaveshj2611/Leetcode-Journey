class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            set2.add(num);
        }

        for(int num : set1){
            if(set2.contains(num)){
                list.add(num);
            }
        }
        int n = nums1.length;
        int n1 = set1.size();
        int n2 = set2.size();
        int common = list.size();
        
        int onlyNums1 = Math.min(n/2,n1-common);
        int onlyNums2 = Math.min(n/2,n2-common);
        
        return Math.min(n,onlyNums1+onlyNums2+common);
    }

}