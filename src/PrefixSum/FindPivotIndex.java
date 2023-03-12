package PrefixSum;

public class FindPivotIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1,7,3,6,5,6};
System.out.println(findPivotIndex(nums));
	}

	private static int findPivotIndex(int[] nums) {
		// TODO Auto-generated method stub
	int leftSum=0;
	int sum=0;
	for(int i=0;i<nums.length;i++)
	{
		sum+=nums[i];
	}
	for(int i=0;i<nums.length;i++)
	{
		if(leftSum==sum-nums[i]-leftSum)
		{
			return i;
		}
		leftSum+=nums[i];
	}return -1;
	}

}
