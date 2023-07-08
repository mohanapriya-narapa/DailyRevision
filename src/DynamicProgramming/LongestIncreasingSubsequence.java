package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1, 2, 5, 3, 4};
System.out.println(LongestIncreasingSubsequence(nums));

	}

	private static int LongestIncreasingSubsequence(int[] nums) {
		// TODO Auto-generated method stub
		int[] dp=new int[nums.length];
		int ans=1;
		Arrays.fill(dp,1);
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(nums[i]>nums[j])
				{
					dp[i]=Math.max(dp[i],dp[j]+1);
					ans=Math.max(ans,dp[i]);
				}
			}
		}
		return ans;
	}

}
