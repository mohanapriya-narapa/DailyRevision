package SlidingWindow;

public class longestSubarrayLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {3, 1, 2, 7, 4, 2, 1, 1, 5};
System.out.println(longestSubarrayLessThanK(nums, 8));
	}

	private static int longestSubarrayLessThanK(int[] nums, int k) {
		// TODO Auto-generated method stub
int left=0;
int cur=0;
int ans=0;
for(int right=0;right<nums.length;right++)
{
	cur+=nums[right];
	while(cur>k)
	{
		cur-=nums[left];
		left++;
	}
	ans=Math.max(ans, right-left+1);
}return ans;
	}

}
