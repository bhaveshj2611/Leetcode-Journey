class Solution {
    public int nextGreaterElement(int n) {
        int[] nums = intToArray(n);
        // System.out.println(Arrays.toString(nums));
        

        int idx = -1;
        int N = nums.length;
        for(int i = N-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }

        if(idx==-1){
            return -1;
        }

        reverse(nums,idx+1);
        for(int i=idx+1;i<N;i++){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        // System.out.println(Arrays.toString(nums));
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = ans * 10 + nums[i];
        }
        if(ans>Integer.MAX_VALUE){
            return -1;
        }
        return (int)ans;
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public void reverse(int[] nums,int start){
        int i= start;
        int j = nums.length-1;
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }}

    public int[] intToArray(int n){
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = Character.getNumericValue(s.charAt(i));
        }
        return arr;
    }
}