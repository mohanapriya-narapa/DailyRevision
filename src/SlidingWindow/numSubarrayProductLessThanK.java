package SlidingWindow;

public class numSubarrayProductLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {10, 5, 2, 6};
System.out.println(numSubarrayProductLessThanK(nums,100));
	}

	
	private static int numSubarrayProductLessThanK(int[] nums, int k) {
		// TODO Auto-generated method stub
		if(k<1)
			return 0;
		int left=0;
		int cur=1;
		int ans=0;
		for(int right=0;right<nums.length;right++)
		{
			cur*=nums[right];
			while(cur>=k)
			{
				cur /=nums[left];
				left++;
			}
			//product
			ans+=right-left+1;
		}return ans;
	}

}
