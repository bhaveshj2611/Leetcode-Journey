class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int val : arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());
        while(k>0){
            k = k - pq.poll();
        }
       

        if(k<0){
            return pq.size()+1;
        }
        else return pq.size();
        
    }
}