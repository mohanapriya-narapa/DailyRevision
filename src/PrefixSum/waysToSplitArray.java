package PrefixSum;

public class waysToSplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {10,4,-8,7};
System.out.println(waysToSplitArray(nums));
	}

	private static int waysToSplitArray(int[] nums) {
		// TODO Auto-generated method stub
		long[] prefix=new long[nums.length];
prefix[0]=nums[0];
for(int i=1;i<nums.length;i++)
{
	prefix[i]=nums[i]+prefix[i-1];
}
int ans=0;
long leftSum=0;long rightSum=0;
for(int i=0;i<nums.length-1;i++)
{
	leftSum=nums[i];
    rightSum=prefix[nums.length-1]-prefix[i];
    if(leftSum>=rightSum)
    {
    	ans++;
    }
	
}return ans;
	}

}
