class Solution {
    public int divide(int dividend, int divisor) {
        long ans = dividend/divisor;
        if(dividend==-2147483648 && divisor==-1) return 2147483647;
        else return (int)ans;
    }
}