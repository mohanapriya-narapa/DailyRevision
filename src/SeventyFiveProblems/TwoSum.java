package SeventyFiveProblems;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] nums=new int[] {2,7,11,15};
int sum=17;
int[] result=twoSum(nums, sum);
for(int x:result)
	System.out.println(x);
	}

public static int[]  twoSum(int[] nums, int target)
{
	HashMap<Integer, Integer> hs=new HashMap<Integer, Integer>();
	int[] result=new int[2];
	for(int i=0;i<nums.length;i++) {
	if(hs.containsKey(nums[i])) {
		result[0]=i;
		result[1]=hs.get(nums[i]);
	}
	else {
		hs.put(target-nums[i],i);
	}
	}
	return result;
}
}
