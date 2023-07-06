package DynamicProgramming;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] cost=new int[] {1,100,1,1,1,100,1,1,100,1};
int n=cost.length;
int[] dp=new int[n+1];
dp[0]=0;
dp[1]=1;
for(int i=2;i<=n;i++)
{
	dp[i]=Math.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
}
System.out.println(dp[n]);
	}

}
