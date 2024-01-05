class Solution {
    public int maximumLength(String s) {
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str = s.substring(i,j);
                if(map.containsKey(str)){
                    map.put(str,map.get(str)+1);
                }
                else map.put(str,1);
            }
        }
        int length = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String str = entry.getKey();
            Integer occurence = entry.getValue();
            if(occurence>=3){
                Set<Character> set = new HashSet<>();
                for(int i=0;i<str.length();i++){
                    set.add(str.charAt(i));
                }
                if(set.size()==1){
                    length = Math.max(length,str.length());
                }
            }
        }
        if(length==0){
            return -1;
        }
        else return length;
    }
}