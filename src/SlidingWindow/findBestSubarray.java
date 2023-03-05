package SlidingWindow;

public class findBestSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {3,-1,4,12,-8,5,6};
System.out.println(findBestSubarray(nums,4));
	}

	private static int findBestSubarray(int[] nums, int k) {
		// TODO Auto-generated method stub
		int cur=0;
		for(int i=0;i<k;i++)
		{
		cur+=nums[i];	
		}
		int ans=cur;
		for(int i=k;i<nums.length;i++)
		{
			cur+=nums[i]-nums[i]-nums[i-k];
			ans=Math.max(ans, cur);
		}
return ans;
	}

}
