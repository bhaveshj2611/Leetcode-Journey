class Solution {
    public int longestConsecutive(int[] arr) {
      
      HashMap<Integer,Boolean> map = new HashMap<>();
        for(int val : arr){
            map.put(val,true);
        }

        for(int val : arr){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
        }
        int maxLength = 0;
        int startPoint = 0;
        for(int val : arr){
            if(map.get(val) == true){
                int tempMaxLength = 1;
                int tempStartPoint = val;

                while(map.containsKey(tempStartPoint + tempMaxLength)){
                    tempMaxLength++;
                }
                if(tempMaxLength>maxLength){
                    maxLength = tempMaxLength;  
                }
            }
        }

        return maxLength;
    }
}