package SeventyFiveProblems;

public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {3,4,5,0, 1,2};
System.out.println(findMin(nums));
	}

	private static int findMin(int[] nums) {
		// TODO Auto-generated method stub
		int low=0;
		int high=nums.length-1;
		while(low<high)
		{
			int mid=low+(high-low)/2;
			if(nums[mid]>nums[high]) {
				low=mid+1;	
			}
			else {
				high=mid;
			}
			
			
		}
		return nums[low];
	}

}
