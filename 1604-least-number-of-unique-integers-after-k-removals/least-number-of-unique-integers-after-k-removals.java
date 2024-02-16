class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int val : arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        // PriorityQueue<Integer> pq = new PriorityQueue<>(count.values());
        // while(k>0){

        // }
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            int val = map.get(key);
            list.add(val);
        }

        Collections.sort(list);
        //  System.out.println(list);
        int j=0;
         while(k>0){
             if(list.get(j) == 1){
                 list.set(j,0);
                 k--;
                 j++;
             }
             else if(list.get(j) > 1){
                 list.set(j,list.get(j)-1);
                 k--;
             }
         }
        // for(int i=0;i<list.size();i++){
        //     if(k==0){
        //         break;
        //     }
        //     if(list.get(i) == 1){
        //         list.set(i,0);
        //         k = k - list.get(i);
        //     }
        //     else{
        //         list.set(i, list.get(i) - 1);
        //         k = k - list.get(i);
        //     }
        // }
        int ans = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=0){
                ans++;
            }
        }
        // System.out.println(list);
        //   System.out.println(list.size());
        // int count = map.size();
        // int init = 1;
        // int ans = 0;
        // int i=0;
        
        
        
        
return ans;
        
    }
}