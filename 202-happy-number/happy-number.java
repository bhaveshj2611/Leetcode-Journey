class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
            // n = squareSum(n);

        } while (fast != slow);

        if (slow == 1)
            return true;
        return false;
    }

    public int squareSum(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans = rem * rem + ans;
            number = number / 10;
        }
        return ans;
    }
}