package Backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<List<Integer>> ans= new LinkedList<>();
int[] nums=new int[] {1,2,3};
backtrack(new ArrayList<>(), 0, ans,nums);
System.out.println(ans);

	}

	private static void backtrack(List<Integer> cur, int i, List<List<Integer>> ans, int[] nums) {
		// TODO Auto-generated method stub
//		if(i>nums.length)
//			
//		{
//			return;
//		}
		ans.add(new ArrayList<>(cur));
		for(int j=i;j<nums.length;j++)
		{
			cur.add(nums[j]);
			backtrack(cur,j+1, ans, nums );
			cur.remove(cur.size()-1);
		}
	}

}
 