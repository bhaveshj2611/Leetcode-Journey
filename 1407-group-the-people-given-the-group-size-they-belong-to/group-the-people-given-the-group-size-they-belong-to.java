class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            // List<Integer> list = new ArrayList<>();
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i],new ArrayList<>());
            }
            if(map.get(groupSizes[i]).size() != groupSizes[i]){
                map.get(groupSizes[i]).add(i);
            }
            else{
                ans.add(new ArrayList<>(map.get(groupSizes[i])));
                map.get(groupSizes[i]).clear();
                 map.get(groupSizes[i]).add(i);
            }

        }

        for(int val : map.keySet()){
            List<Integer> li = map.get(val);
            ans.add(li);
        }

        // System.out.println(map);
        return ans;
    }
}