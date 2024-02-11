class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums2) {
            
            while(!st.isEmpty() && num> st.peek()){
                map.put(st.pop(),num);
            }
            st.push(num);

        }

        // System.out.println(map);

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                ans[i] = map.get(nums1[i]);
            }
            else {
                ans[i] = -1;
            }
        }
        return ans;
    }
}