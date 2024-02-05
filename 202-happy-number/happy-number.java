class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while(n != 1){
            set.add(n);
            
            n = squareSum(n);
            if(set.contains(n)){
                return false;
            }
            
        }
        return true;
    }

    public int squareSum(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem*rem;
            n = n/10;
        }
        return sum;
    }
}