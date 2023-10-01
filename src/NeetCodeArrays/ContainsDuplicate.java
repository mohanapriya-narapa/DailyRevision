package NeetCodeArrays;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1,2,3,4};
System.out.println(containsDuplicate(nums));
	}

	private static boolean containsDuplicate(int[] nums) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(hs.contains(nums[i])) {
				return false;
			}
			hs.add(nums[i]);
		}return true;
	}

}
