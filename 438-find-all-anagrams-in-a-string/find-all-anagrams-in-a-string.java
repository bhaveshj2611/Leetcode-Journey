class Solution {
    public List<Integer> findAnagrams(String txt, String pat) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<pat.length();i++){
            char fre = pat.charAt(i);
            map.put(fre,map.getOrDefault(fre,0)+1);
        }

        List<Integer> ans = new ArrayList<>();
        
        int i=0;int j=0;
        
        int k = pat.length();
        int count = map.size();
        while(j<txt.length()){
            char ch = txt.charAt(j);
            if(map.containsKey(ch)){
        
                   map.put(ch,map.get(ch)-1); 
                if(map.get(ch) == 0){
                    count--;
                }
               
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(count == 0){
                    ans.add(i);
                }
                 char c = txt.charAt(i);
                if(map.containsKey(c)){
                     if(map.get(c) == 0){
                    count++;
                }
              
                map.put(c,map.getOrDefault(c,0) + 1);
                }
                 
               
               
            
                i++;
                j++;
            }
        }
        return ans;
    }
}