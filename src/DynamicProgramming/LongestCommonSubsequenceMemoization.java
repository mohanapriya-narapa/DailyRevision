package DynamicProgramming;

public class LongestCommonSubsequenceMemoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dp=new int[7][8];
		  for (int i = 0; i <7; i++) {
	            for (int j = 0; j < 8; j++) {
	                dp[i][j] = -1;
	            }
	        }
		System.out.println(LongestCommonSubsequenceMemoization("AGGTAB", "GXTXAYB",6, 7,dp ));
	}

	private static int LongestCommonSubsequenceMemoization(String str1, String str2, int m, int n,int[][] dp) {
		
		// TODO Auto-generated method stub
		if(m==0 || n==0)
		{
			return 0;
		}
		if(dp[m][n]!=-1)
		{
			return dp[m][n];
		}
		if(str1.charAt(m-1)==str2.charAt(n-1))
		{
			return dp[m][n]= LongestCommonSubsequenceMemoization(str1,str2,m-1,n-1,dp)+1;
		}
		else
		{
		 dp[m][n]= Math.max(LongestCommonSubsequenceMemoization(str1,str2,m,n-1,dp), LongestCommonSubsequenceMemoization(str1,str2,m-1,n,dp));
		}
		return dp[m][n];
	}

}
