package DynamicProgramming;

public class LongestCommonSubsequencetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LongestCommonSubsequenceTable("AGGTAB", "GXTXAYB",6, 7 ));
	}

	private static int LongestCommonSubsequenceTable(String str1, String str2, int m, int n) {
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
		return dp[m][n];
	}

}
