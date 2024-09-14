class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;       // Total gas left after completing the circuit
        int currGas = 0;        // Current gas available in the tank
        int startStation = 0;   // Starting station index
        
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i] - cost[i];
            currGas += gas[i] - cost[i];
            
            // If the current gas in the tank goes negative, reset the start station
            if (currGas < 0) {
                startStation = i + 1; // Move start station to the next one
                currGas = 0;          // Reset current gas for the new starting point
            }
        }
        
        // If totalGas is negative, it's impossible to complete the circuit
        return totalGas >= 0 ? startStation : -1;
    }
}
