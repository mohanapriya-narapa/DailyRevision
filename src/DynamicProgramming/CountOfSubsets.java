package DynamicProgramming;

public class CountOfSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {1, 2, 3, 3};
System.out.println(countSubset(arr, arr.length, 6));
	}

	private static int countSubset(int[] nums, int length, int sum) {
		// TODO Auto-generated method stub
		int[][] table=new int[length+1][sum+1];
		// TODO Auto-generated method stub
		for(int i=0;i<=nums.length;i++)
		{
			table[i][0]=1;
		}
		for(int j=1;j<=sum;j++)
		{
			table[0][j]=0;
		}
		for(int i=1;i<=nums.length;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(nums[i-1]<=j)
				{
					table[i][j]=table[i-1][j-nums[i-1]] + table[i-1][j];
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
