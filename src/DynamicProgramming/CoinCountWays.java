package DynamicProgramming;

public class CoinCountWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1,2,3};
System.out.println(CoinWays(arr, arr.length,4));
	}

	private static int CoinWays(int[] arr, int n, int sum) {
		// TODO Auto-generated method stub
		int[][] table=new int[n+1][sum+1];
	
				for(int i=0;i<=n;i++)
				{
					table[i][0]=1;
				}
				for(int j=1;j<=sum;j++)
				{
					table[0][j]=0;
				}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sum;j++)
			{if(arr[i-1]<=j)
				table[i][j]=table[i][j-arr[i-1]]+table[i-1][j];
			else
				table[i][j]=table[i-1][j];
			}
		}
		return table[n][sum];
	}

}
