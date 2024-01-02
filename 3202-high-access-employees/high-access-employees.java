class Solution {

    boolean isHighAccess(List<Integer> times){
        for(int i=2;i<times.size();i++){
                int currTime = times.get(i);
                int prevTime = times.get(i-2);
                if(prevTime + 99 >= currTime){
                    return true;
                }
        }
        return false;
    }

    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        List<String> ans = new ArrayList<>();
        HashMap<String, List<Integer>> map = new HashMap<>();
        for(List<String> list : access_times){
            String emp = list.get(0);
            String times = list.get(1);

            if(!map.containsKey(emp)){
                map.put(emp, new ArrayList<>());
            }
            int t = Integer.parseInt(times);
            map.get(emp).add(t);
        }

        for(String emp : map.keySet()){
            List<Integer> times = map.get(emp);
            Collections.sort(times);
            if(isHighAccess(times)){
                ans.add(emp);
            }
        }
        return ans;
    }
}