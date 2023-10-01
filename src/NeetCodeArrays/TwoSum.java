package NeetCodeArrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {2,7,11,15};
System.out.println(twoSum(nums, 9));
	}

	private static List<Integer> twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		List<Integer> li=new LinkedList<Integer>();
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(hs.containsKey(nums[i]))
			{
				li.add(i);
				li.add(hs.get(nums[i]));
				
			}
			else {
				hs.put(target-nums[i],i);
			}
			
		}
		return li;
	}

}
