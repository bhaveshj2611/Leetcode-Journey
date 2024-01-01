class Solution {
    int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    // void bS(int start, int end, int divisor1, int divisor2, int lcm, int ans, int c1, int c2) {
    //     if (start <= end) {
    //         int m = start + (end - start) / 2;
    //         int a, b, c;
    //         a = m - (m / divisor1);
    //         b = m - (m / divisor2);
    //         c = m - (m / divisor1) - (m / divisor2) + (m / lcm);

    //         if (a >= c1 && b >= c2 && c >= c1 + c2) {
    //             ans = Math.min(ans, m);
    //             bS(start, m - 1, divisor1, divisor2, lcm, ans, c1, c2);
    //         } else {
    //             bS(m + 1, end, divisor1, divisor2, lcm, ans, c1, c2);
    //         }
    //     }
        
    // }

    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        long start = 1;
        long end = (int)10e10;
        long ans = end;
    
        long lcm = ((long)divisor1*(long)divisor2)/gcd(divisor1,divisor2);

        // int ans = 1000000000;
        // bS(2, 1000000000, divisor1, divisor2, lcm, ans, uniqueCnt1, uniqueCnt2);
        while(start<=end){
            long mid = start + (end-start)/2;
            int a = (int) (mid - mid/divisor1);
            int b = (int) (mid - mid/divisor2);
            int c = (int) (mid - mid/lcm);
            if (a >= uniqueCnt1 && b >= uniqueCnt2 && c >= uniqueCnt1+uniqueCnt2) {
                ans = Math.min(ans, mid);
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return (int)ans;
    }
}
