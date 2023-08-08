package DynamicProgramming;

public class MinDelAndInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minDelAndInsert("geeksforgeeks", "geeks",13,5);
	}

	private static void minDelAndInsert(String str1, String str2, int m, int n) {
		// TODO Auto-generated method stub
		int[][] dp=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0)
				{
					dp[i][j]=0;
				}
				else if(str1.charAt(i-1)==str2.charAt(j-1))
				{
					dp[i][j]=1+dp[i-1][j-1];
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		System.out.println(m-dp[m][n]);
		System.out.println(n-dp[m][n]);
		
	}

}
