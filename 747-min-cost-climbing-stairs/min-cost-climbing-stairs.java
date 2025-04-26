class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev1 = 0, prev2 = 0;
        
        for (int i = 0; i < cost.length; i++) {
            int currentCost = cost[i] + (prev1 < prev2 ? prev1 : prev2);
            prev2 = prev1;
            prev1 = currentCost;
        }
        
        return prev1 < prev2  ?prev1 : prev2;
    }
}