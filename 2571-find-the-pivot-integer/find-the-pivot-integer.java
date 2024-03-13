class Solution {
    public int pivotInteger(int n) {
        int start = 1;
        int end = n;
        // if(end == 1){
        //     return 1;
        // }
        int wholeSum = (n*(n+1))/2;
        while(start<=end){
            int mid = start + (end-start) / 2;
            int firstSum = (mid*(mid+1))/2;
            int lastSum = mid + wholeSum - firstSum;

            if(firstSum<lastSum){
                start = mid + 1;
            }
            else if (lastSum<firstSum){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}