class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

    int gasSum = 0;
    int costSum = 0;
    for(int i=0;i<gas.length;i++){
        gasSum += gas[i];
        costSum += cost[i];
    }

    if(gasSum - costSum < 0){
        return -1;
    }
    int sum = 0;
    int start = 0;
    for(int i=0;i<gas.length;i++){
        sum = sum + (gas[i]-cost[i]);
        if(sum<0){
            sum = 0;
            start = i +1;
        }
    }
    return start;
}
}