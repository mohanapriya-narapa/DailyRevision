package Backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class combinationwithlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ans= new LinkedList<>();
		int[] nums=new int[] {1,2,3,4};
		backtrack(new ArrayList<>(), 0, ans,nums,2);
		System.out.println(ans);
	}

	private static void backtrack(List<Integer> cur, int i, List<List<Integer>> ans, int[] nums,int k) {
		// TODO Auto-generated method stub
		if(cur.size()==k)
		{
			ans.add(new ArrayList<>(cur));
			return;
		}
			for(int j=i;j<nums.length;j++)
			{
			cur.add(nums[j]);
			backtrack(cur,j+1,ans,nums,k);
			cur.remove(cur.size()-1);
			}
	}

}
