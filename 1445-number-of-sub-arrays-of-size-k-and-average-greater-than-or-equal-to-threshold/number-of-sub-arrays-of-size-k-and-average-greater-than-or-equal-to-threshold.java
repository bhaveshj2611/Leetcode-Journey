class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0;
        int j=0;
        int avg = 0;
        int cnt = 0;
        int sum = 0;
        while(j<arr.length){
            sum = sum + arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                avg =  sum / k;
                if(avg>=threshold){
                    cnt++;
                }
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return cnt;
    }
}