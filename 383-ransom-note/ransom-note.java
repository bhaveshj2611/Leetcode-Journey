class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
    
        for(int i=0;i<magazine.length();i++){
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(int i=0;i<ransomNote.length();i++){
            char ransom = ransomNote.charAt(i);
            if(map.containsKey(ransom)){
                if(map.get(ransom)==1){
                    map.remove(ransom);
                }
                else{
                    map.put(ransom,map.get(ransom)-1);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}