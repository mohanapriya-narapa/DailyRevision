package DynamicProgramming;

import java.util.Stack;

public class PrintSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSubsequence("AGGTAB", "GXTXAYB",6, 7 );
	}
	private static void printSubsequence(String str1, String str2, int m, int n) {
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
		Stack<Character> st=new Stack<Character>();
		int i=m;int j=n;
		while(i>0 && j>0)
		{
			if(str1.charAt(i-1)==str2.charAt(j-1))
			{
				st.push(str1.charAt(i-1));
				i--;
				j--;
			}
			else if(dp[i-1][j] > dp[i][j-1])
			{
				i--;
			}
			else
			{
				j--;
			}
			
		}int z=st.size();
		for(int k=0;k<z;k++)
		{
			System.out.println(st.peek());
			st.pop();
		}
		System.out.println(st);
	}
	
}
