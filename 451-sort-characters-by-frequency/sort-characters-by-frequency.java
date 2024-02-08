class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();


        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

       PriorityQueue<Character> pq = new PriorityQueue<>(
           (obj1,obj2) -> (map.get(obj2)- map.get(obj1)));
       

       pq.addAll(map.keySet());
       while(!pq.isEmpty()){
           char ch = pq.poll();
           for(int i=0;i<map.get(ch);i++){
               sb.append(ch);
           }
       }
       
        return sb.toString();
    }
}