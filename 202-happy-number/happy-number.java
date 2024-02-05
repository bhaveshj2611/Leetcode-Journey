class Solution {
    public boolean isHappy(int n) {
   
        int fast = n;
        int slow = n;
        do{
            fast = squareSum(squareSum(fast));
            slow = squareSum(slow);
        }
        while(fast != slow);

        if(slow == 1){
            return true;
        }
        return false;

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