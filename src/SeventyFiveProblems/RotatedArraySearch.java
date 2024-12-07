package SeventyFiveProblems;

public class RotatedArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {4,5,6,7,0,1,2};
System.out.println(searchElement(nums, 1));

	}

	private static int searchElement(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left=0;int right=nums.length-1;
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(nums[mid]==target)
				return mid;
			if(nums[left]<nums[mid])
			{
				if(nums[left]<target && nums[mid]>target)
				{
					right=mid-1;
				}
				else {
					left=mid+1;
				}
			
			}
			else {
				if(nums[mid]<target && nums[right]>target)
				{
					left=mid+1;
				}
				else {
					right=mid-1;
				}
			}
			
		}
		return -1;
	}

}
