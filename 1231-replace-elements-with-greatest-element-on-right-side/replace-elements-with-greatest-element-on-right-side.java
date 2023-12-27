class Solution {
    public int[] replaceElements(int[] arr) {
        
      int n = arr.length;
   

      for(int i=0;i<n-1;i++){
          arr[i] = arr[i+1];
      }
        arr[n-1] = -1;

      for(int i=n-2;i>=0;i--){
          if(arr[i]<arr[i+1]){
              arr[i] = arr[i+1];
          }
        //   arr[i] = arr[i+1];
      }
      return arr;
    }
}