package DynamicProgramming;

public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {3, 34, 4, 12, 5, 2};
int sum=9;

System.out.println(subsetSum(nums,nums.length,sum));
	}

	private static boolean subsetSum(int[] nums, int length, int sum) {
		boolean[][] table=new boolean[length+1][sum+1];
		// TODO Auto-generated method stub
		for(int i=0;i<=nums.length;i++)
		{
			table[i][0]=true;
		}
		for(int j=1;j<=sum;j++)
		{
			table[0][j]=false;
		}
		for(int i=1;i<=nums.length;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(nums[i-1]<=j)
				{
					table[i][j]=table[i-1][j-nums[i-1]] || table[i-1][j];
				}
				else
				{
					table[i][j]=table[i-1][j];
				}
			}
		}
		return table[length][sum];
	}

}
