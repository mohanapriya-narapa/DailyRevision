package DynamicProgramming;

public class ClimbinghStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(ClimbingStairs(3));

	}

	private static int ClimbingStairs(int n) {
		// TODO Auto-generated method stub
	int[] dp=new int[n+1];
	if(n==1)
		return 1;
	dp[1]=1;
	dp[2]=2;
	for(int i=3;i<=n;i++)
	{
		dp[i]=dp[i-1]+dp[i-2];
	}
	return dp[n];
	}

}
