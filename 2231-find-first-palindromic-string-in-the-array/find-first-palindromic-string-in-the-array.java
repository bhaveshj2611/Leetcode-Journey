class Solution {
    public String firstPalindrome(String[] words) {
        
        
        for(String s : words){
            StringBuilder rev = new StringBuilder(s).reverse();
            
            if(s.equals(rev.toString())){
                return s;
            }
        }
        return "";
    }
}