package DynamicProgramming;

import java.util.Arrays;

public class CoinschangebottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins=new int[] {1,2,5};
		System.out.println(coinChange(coins,coins.length, 5));
	}
	private static int coinChange(int[] coins,int n, int amount) {
		// TODO Auto-generated method stub
		int max=amount+1;
		int[] dp=new int[max];
		Arrays.fill(dp,max);
		dp[0]=0;
		for(int i=0;i<=amount;i++)
		{
			for(int j=0;j<coins.length;j++)
			{
				if(coins[j]<=i)
				{
					dp[i]=Math.min(dp[i], dp[i-coins[j]]+1);
				}
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}
}
