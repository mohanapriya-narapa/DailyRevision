package Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= new int[] {2,1,5,4,3,0,0};
nextPermutation(arr);
for(int x:arr) {
System.out.println(x);
}
	}

	private static void nextPermutation(int[] nums) {
		// TODO Auto-generated method stub
	int i=nums.length-2;
	while(i>=0 && nums[i]>=nums[i+1])
	{
		i--;
	}
	if(i>0)
	{
		int j=nums.length-1;
		while(nums[i]>=nums[j])
		{
			j--;
		}
		swap(nums,i,j);
	}
	reverse(nums,i+1);
	}

	private static void reverse(int[] nums, int start) {
		// TODO Auto-generated method stub
int i=start;
int j=nums.length-1;
while(i<j)
{
	swap(nums,i,j);
	i++;
	j--;
}

	}

	private static void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;		
	}

}
