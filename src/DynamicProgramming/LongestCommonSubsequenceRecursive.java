package DynamicProgramming;

public class LongestCommonSubsequenceRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(LongestCommonSubsequenceRecursive("AGGTAB", "GXTXAYB",6, 7 ));
	}

	private static int LongestCommonSubsequenceRecursive(String str1, String str2, int m, int n) {
		// TODO Auto-generated method stub
		if(m==0 || n==0)
		{
			return 0;
		}
		if(str1.charAt(m-1)==str2.charAt(n-1))
		{
			return LongestCommonSubsequenceRecursive(str1,str2,m-1,n-1)+1;
		}
		else
		{
			return Math.max(LongestCommonSubsequenceRecursive(str1,str2,m,n-1), LongestCommonSubsequenceRecursive(str1,str2,m-1,n-1));
		}
		
	}

}
