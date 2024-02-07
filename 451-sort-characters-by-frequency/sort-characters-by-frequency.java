class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Integer,List<Character>> revMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // System.out.println(map);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            Character key = entry.getKey();
            if (!revMap.containsKey(value)) {
                revMap.put(value, new ArrayList<>());
            }
            revMap.get(value).add(key);
        }
        // System.out.println(revMap);
         Map<Integer, List<Character>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(revMap);
        // System.out.println(sortedMap);
         StringBuilder sb = new StringBuilder();
        for(int key : sortedMap.keySet()){
            List<Character> value = sortedMap.get(key);
            for(int i=0;i<value.size();i++){
                for(int j=0;j<key;j++){
                    sb.append(value.get(i));
                }
                
            }
        }
    //  System.out.println(sb.toString());
       
        return sb.toString();
    }
}