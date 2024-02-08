class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();


        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((obj1,obj2) -> map.get(obj2)-map.get(obj1));
        for(int i=0;i<list.size();i++){
            for(int j=0;j<map.get(list.get(i));j++){
                sb.append(list.get(i));
            }
        }
    
       
        return sb.toString();
    }
}