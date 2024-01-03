class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       
        int gasSum = 0;
        int costSum = 0;
        for(int i=0;i<gas.length;i++){
            gasSum = gasSum + gas[i];
            costSum = costSum + cost[i];
        }
        if(gasSum-costSum<0){
            return -1;
        }
        int remaining = 0;
        int start = 0;
        for(int i=0;i<gas.length;i++){
            remaining = remaining + (gas[i]-cost[i]);
            if(remaining<0){
                start = i+1;
                remaining=0;
            }
        }
        return start;
    }
}