class Solution {
    public String customSortString(String order, String s) {
       

        Map<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        String ans = "";
        for(char ch : order.toCharArray()){
            if(map.containsKey(ch)){
                for(int i=0;i<map.get(ch);i++){
                  ans = ans + ch;
                }
                map.remove(ch);
            }
        }

        for(char ch : map.keySet()){
            int f = map.get(ch);
            for(int i=0;i<f;i++){
                ans = ans + ch;
            }
        }
        
      
        return ans;
    }
}