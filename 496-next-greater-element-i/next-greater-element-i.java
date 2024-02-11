class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int[] ans = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        // int[] index = new int[nums2.length];
        // int[] ngr = new int[nums2.length];
        Map<Integer,Integer> map = new HashMap<>();
        // List<Integer> list = new ArrayList<>();
        // List<Integer> index = new ArrayList<>();
        for(int i=nums2.length-1;i>=0;i--){
            if(st.isEmpty()){
                // index.add(nums2[i]);
                // list.add(-1);
                map.put(nums2[i], -1);

                st.push(nums2[i]);
            }

           else if(st.peek() > nums2[i]){
                // list.add(st.peek());
                // index.add(nums2[i]);
                map.put(nums2[i], st.peek());
                st.push(nums2[i]);
            }
            else if(st.peek()<= nums2[i]){
                while(!st.isEmpty() && st.peek()<=nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    // index.add(nums2[i]);
                    // list.add(-1);
                    map.put(nums2[i], -1);
                    st.push(nums2[i]);
                }
                else if(st.peek()>nums2[i]){
                    map.put(nums2[i], st.peek());
                    st.push(nums2[i]);
                }
                
            }


        }
        // System.out.println(map);
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                ans[i] = map.get(nums1[i]);
            }
        }
        return ans;
    }
}