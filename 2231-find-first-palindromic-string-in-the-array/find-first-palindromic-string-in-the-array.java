class Solution {
    public String firstPalindrome(String[] words) {
        
        
        for(String s : words){
            boolean ans = isPalindrome(s);
            if(ans){
                return s;
            }
        }
        return "";
    }

    public boolean isPalindrome(String s){
        // char first = s.charAt(0);
        // char second= s.charAt(s.length()-1);
        int i=0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}