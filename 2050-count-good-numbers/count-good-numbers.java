class Solution {
    public int countGoodNumbers(long n) {
        // long ans = 1;
        long MOD = 1000000007;
        long odd = n/2;
        long even = (n+1)/2;
        // System.out.println(odd);
        // System.out.println(even);
        // System.out.println(Math.pow(5,even));
        // System.out.println(Math.pow(4,odd));
        return (int)((pow(5,even)*pow(4,odd))%MOD );
        // return (int) helper(N, ans) % 1000000007;


        
       
    }


    long pow(long x, long n){
         if(n==0){
            return 1;
         }
         long temp = pow(x,n/2);
        if(n%2==0){
            return (temp*temp)%  1000000007;
        }
        else {
            return (x*temp*temp)%1000000007;
        }
        // return left*right;/
    }
}