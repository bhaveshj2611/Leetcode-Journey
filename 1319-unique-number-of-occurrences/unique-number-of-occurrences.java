class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         Map<Integer,Integer> m = new HashMap<>();
        for(int i:arr)
            m.merge(i,1,Integer::sum);
        Set<Integer> s = new HashSet<>();
        for(var i:m.entrySet())
            s.add(i.getValue());

        return s.size() == m.size();
    }
}