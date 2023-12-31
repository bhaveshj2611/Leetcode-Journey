class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int [] nums, int target, int start, int end){
        int mid = start + (end-start)/2;
        if(start<=end){
            if(nums[mid]>target){
            return binarySearch(nums,target,start,mid-1);
        }
        else if(nums[mid]<target){
            return binarySearch(nums,target,mid+1,end);
        }
        else {return mid;}
        }
        return -1;
        
    }
    
    }
