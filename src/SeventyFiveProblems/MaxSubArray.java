package SeventyFiveProblems;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {-2,1,-3,4,-1,2,1,-5,4};
System.out.println(maxSubArray(nums));
	}

	private static int maxSubArray(int[] nums) {
		// TODO Auto-generated method stub
		int maxSoFar=Integer.MIN_VALUE;
		int maxEndHere=0;
		for(int i=0;i<nums.length;i++)
		{
			maxEndHere+=nums[i];
			maxSoFar=Math.max(maxEndHere, maxSoFar);
			if(maxEndHere<0)
			{
				maxEndHere=0;
			}
				
		}
		return maxSoFar;
	}

}
