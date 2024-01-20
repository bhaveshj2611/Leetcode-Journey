class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int gasSum = 0;
        int costSum = 0;
        for(int i=0;i<gas.length;i++){
            gasSum += gas[i];
            costSum += cost[i];
        }
        if(costSum>gasSum){
            return -1;
        }
        int rem = 0;
        int start = 0;
        for(int i=0;i<gas.length;i++){
            rem = rem + (gas[i]-cost[i]);
            if(rem<0){
                rem = 0;
                start = i+1;
            }
        }
        return start;
    }
}