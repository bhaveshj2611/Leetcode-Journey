class Solution {
    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int val : arr) {
            
            int rem = val%k;
            if(rem<0){
                rem = rem + k;
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        // System.out.println(map);

        for (int val : arr) {
              
            int rem = val%k;
            if(rem<0){
                rem = rem + k;
            }
            if (rem == 0 || 2 * rem == k ) {
                if (map.get(rem) % 2 == 1) {
                    // System.out.println("1");
                    return false;
                }

            }

          

            else {
                // System.out.println(rem);
                int first = map.get(rem);
                int second = map.getOrDefault(k - rem, 0);
                if (first != second) {
                    return false;
                }

            }
        }

        return true;
    }
}