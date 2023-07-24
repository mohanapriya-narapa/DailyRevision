package DynamicProgramming;

public class EqualSumPartitionDynamicProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1, 5, 12, 6};
int sum=0;
for(int i=0;i<nums.length;i++)
{
	sum+=nums[i];
}
if(sum%2==0)
{
	System.out.println(equalSumPartition(nums,nums.length,sum/2));
}
else
{
	System.out.println(false);
}
	}

	private static boolean equalSumPartition(int[] nums,int length, int sum) {
		// TODO Auto-generated method stub
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
