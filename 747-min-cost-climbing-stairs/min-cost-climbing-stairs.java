class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(fib(n-1,dp,cost),
        fib(n-2,dp,cost));
        
    }
    public static  int fib(int n,int []dp,int[]cost){
        if(n==0){
            return  cost[0];

        }
        if(n==1){
            return cost[1];
        }
        if(dp[n]!=-1){
                return dp[n];
        }
        int left=fib(n-1,dp,cost)+cost[n];
      
        
           int  right=fib(n-2,dp,cost)+cost[n];
        
           return dp[n]=Math.min(left,right);
    }
}