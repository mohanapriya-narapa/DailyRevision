package Backtrack;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1, 2, 3};
		List<List<Integer>> ans=new ArrayList<>();
		permutations(new ArrayList<>(), ans, nums);
		System.out.println(ans);
	}

	private static void permutations(List<Integer> cur, List<List<Integer>> ans, int[] nums) {
		// TODO Auto-generated method stub
		if(cur.size()==nums.length)
		{
			ans.add(new ArrayList<>(cur));
			return;
		}
		for(int num:nums)
		{
			if(!cur.contains(num))
			{
				cur.add(num);
				permutations(cur, ans, nums);
				cur.remove(cur.size()-1);
			
			}
		}
		
	}
}
