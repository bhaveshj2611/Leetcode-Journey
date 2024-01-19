class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        // HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            
            }
            else{
                set.add(n);
                n = squareSum(n);
            }
           
        }    
        return true;
    }

    public int squareSum(int number){
        int ans = 0;
        while(number>0){
            int rem = number%10;
            ans = rem*rem + ans;
            number = number/10;
        }
        return ans;
    }
}