class Solution {
    public String firstPalindrome(String[] words) {
        
        
        for(String s : words){
            StringBuilder sb = new StringBuilder(s);
            String rev = sb.reverse().toString();
            if(s.equals(rev)){
                return s;
            }
        }
        return "";
    }
}