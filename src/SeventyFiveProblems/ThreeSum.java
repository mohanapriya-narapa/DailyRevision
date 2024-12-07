package SeventyFiveProblems;
import java.util.*;
public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {-1,0,1,2,-1,-4};
int target=0;
Arrays.sort(nums);

System.out.println(search(nums, target));
	}

	private static List<List<Integer>> search(int[] nums, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> result=new LinkedList<>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++)
		{
			if(i==0 || nums[i]!=nums[i-1])
			{
				int left=i+1;
				int right=nums.length-1;
				while(left<right)
				{
					int sum=nums[i]+nums[left]+nums[right];
					if(sum==0)
					{
						result.add(Arrays.asList(nums[i], nums[left], nums[right]));
						while(left<right && nums[left]==nums[left+1])left++;
						while(left<right && nums[right]==nums[right-1])right--;
						left++;
						right--;
						
					}
					else if(sum<0)
					{
						left++;
					}
					else {right--;
				}
			}
		}
		
	}
return result;
	
	}
	}
