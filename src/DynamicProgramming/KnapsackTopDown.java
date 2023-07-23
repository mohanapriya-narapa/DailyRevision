package DynamicProgramming;

public class KnapsackTopDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int profit[] = { 60, 100, 120 };
	        int weight[] = { 10, 20, 30 };
	        int W = 50;
	        int[][] table=new int[profit.length+1][W+1];
	        System.out.println(knapsack(profit,weight,W, profit.length, table ));
	}

	private static int knapsack(int[] profit, int[] weight, int w, int n, int[][] table) {
		// TODO Auto-generated method stub
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=w;j++)
		{
			if(i==0 || j==0)
			{
			table[i][j]=0;
			}
			else if(weight[i-1]<=j)
			{
				 table[i][j]= Math.max(profit[i-1]+table[i-1][j-weight[i-1]], table[i-1][j]);
			}
			else
			{
			table[i][j]=table[i-1][j];
			}
		}
	}
		return table[n][w];
	}

}
