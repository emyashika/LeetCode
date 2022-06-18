class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost){
        int sum = 0, surplus = 0, start = 0; 
        for (int i = 0; i < gas.length; i++){
            sum += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            if (surplus < 0){
                surplus = 0;
                start = i + 1;
            }
        }
            return sum >= 0 ? start : -1;  
    }
}