package DynamicProgramming;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="GeeksforGeeks";
		String str2="GeeksQuiz";
		
System.out.println(LongestCommonSubstring(str1,str2,str1.length(),str2.length() ));
	}

	private static int LongestCommonSubstring(String str1, String str2, int m, int n) {
		int[][] dp=new int[m+1][n+1];
		int result=0;
		// TODO Auto-generated method stub
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
					dp[i][j]=dp[i-1][j-1]+1;
					result=Math.max(result,dp[i][j]);
				}
				else
				{
					dp[i][j]=0;
				}
			}
		}
		
		return result;
	}

}
