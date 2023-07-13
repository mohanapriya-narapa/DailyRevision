package DynamicProgramming;

public class KnapsackMemoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt=new int[] {4, 5, 1};
		int[] profit=new int[] {1, 2, 3};
		int[][] dp=new int[profit.length+1][5];
		 for (int i = 0; i < dp.length; i++)
	            for (int j = 0; j < dp[0].length; j++)
	                dp[i][j] = -1;
		System.out.println(knapsackMemoization(wt, profit, wt.length, 4, dp));
	}

	private static int knapsackMemoization(int[] wt, int[] profit, int n, int capacity, int[][] dp) {
		// TODO Auto-generated method stub
		if(n==0 || capacity==0)
		{
			return 0;
		}
		if(dp[n][capacity]!=-1)
		{
			return dp[n][capacity];
		}
		if(wt[n-1]>capacity)
		{
			return dp[n][capacity]=knapsackMemoization(wt,profit,n-1,capacity,dp);
		}
		else
		{
			return dp[n][capacity]=Math.max( profit[n-1]+knapsackMemoization(wt,profit,n-1,capacity-wt[n-1],dp),knapsackMemoization(wt,profit,n-1,capacity,dp));
		}
	
	}

}
