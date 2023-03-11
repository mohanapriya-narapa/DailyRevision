package SlidingWindow;

public class minSubArrayLen {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int start=0;
int end=0;
int minLen=Integer.MAX_VALUE;
int sum=0;
int[] nums=new int[] {2,3,1,2,4,3};
int target=7;
while(end<nums.length)
{
	sum+=nums[end];
	while(sum>=target)
	{
		int len=end-start+1;
		minLen=Math.min(len,minLen);
		sum-=nums[start++];
	}
	end++;
}
System.out.println(minLen);
	}

}
