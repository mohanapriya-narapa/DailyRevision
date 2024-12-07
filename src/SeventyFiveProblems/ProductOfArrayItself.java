package SeventyFiveProblems;

public class ProductOfArrayItself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,2,3,4};
int[] result=productArrayItSelf(nums);
for(int x:result)
{
	System.out.println(x);
}
	}

	private static int[] productArrayItSelf(int[] nums) {
		// TODO Auto-generated method stub
		int[] left=new int[nums.length];
		int[] right=new int[nums.length];
		int[] prod=new int[nums.length];
		left[0]=1;
		right[nums.length-1]=1;
		for(int i=1;i<nums.length;i++)
		{
		left[i]=nums[i-1]*left[i-1];
		}
		for(int i=nums.length-2;i>=0;i--)
		{
	right[i]=right[i+1]*nums[i+1];
		}
		for(int i=0;i<nums.length;i++)
		{
		prod[i]=left[i]*right[i];
		}
		return prod;
	}

}
