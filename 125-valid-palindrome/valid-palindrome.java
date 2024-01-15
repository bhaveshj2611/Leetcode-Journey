class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String small = s.toLowerCase();
        for(int i=0;i<small.length();i++){
            if((small.charAt(i)>96 && small.charAt(i)<123) || (small.charAt(i)>47 && small.charAt(i)<58)){
                sb.append(small.charAt(i));
            }
        }
        String orgn = sb.toString();
        String reverse = sb.reverse().toString();
        
        System.out.println(reverse);
        System.out.println(orgn);
        // if(small.length()==0){
        //     return true;
        // }

        for(int i=0;i<orgn.length();i++){
            if(orgn.charAt(i) != reverse.charAt(i)){
                return false;
            }
        }

        // if(sb.reverse().equals(sb)){
        //       System.out.println(sb.toString());
        //         System.out.println(sb.reverse().toString());
            // return true;
        // }
      
        return true;
    }
}