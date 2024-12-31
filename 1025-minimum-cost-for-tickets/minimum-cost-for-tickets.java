import java.util.*;

class Solution {
    private boolean[] need = new boolean[366];
    private int[] dp = new int[366];

    private int f(int d, int d0, int[] costs) {
        if (d < d0) return 0;
        if (!need[d]) return f(d - 1, d0, costs);
        if (dp[d] != -1) return dp[d];
        return dp[d] = Math.min(
            costs[0] + f(d - 1, d0, costs),
            Math.min(
                costs[1] + f(d - 7, d0, costs),
                costs[2] + f(d - 30, d0, costs)
            )
        );
    }

    public int mincostTickets(int[] days, int[] costs) {
        Arrays.fill(dp, -1);
        for (int d : days) {
            need[d] = true;
        }
        return f(days[days.length - 1], days[0], costs);
    }
}
