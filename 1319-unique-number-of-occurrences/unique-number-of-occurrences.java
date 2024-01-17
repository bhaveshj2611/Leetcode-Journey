class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else map.put(arr[i],map.get(arr[i])+1);
        }

        HashSet<Integer> seenOccurrences = new HashSet<>();
        for (int value : map.values()) {
            if (!seenOccurrences.add(value)) {
                return false; // Duplicate occurrence found
            }
        }
        return true;
    }
}