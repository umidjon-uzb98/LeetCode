package com.company.easy;

public class E70_ClimbingStairs {
    //    Input: n = 3
    //    Output: 3
    //    Explanation: There are three ways to climb to the top.
    //1. 1 step + 1 step + 1 step
    //2. 1 step + 2 steps
    //3. 2 steps + 1 step


    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        int current = 0;
        int prev1 = 2;
        int prev2 = 1;

        for(int i=3; i<=n; i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;

    }

    /*
    public int climbStairs(int n) {
        if(n == 1) return 1;

        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;

        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];

    }*/
}
