package Backtrack;

import java.util.*;

public class CombinationaSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] candidates=new int[] {2,3,6,7};

int target =7;
List<List<Integer>> ans=combinationalSum(candidates, target);
System.out.println(ans);
	}

	private static List<List<Integer>> combinationalSum(int[] candidates, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> res=new LinkedList<>();
		backtrack(new ArrayList<>(),target, candidates, res,0,0 );
		return res;
	}

	private static void backtrack(List<Integer> cur, int target, int[] candidates, List<List<Integer>> res, int sum,
			int start) {
		// TODO Auto-generated method stub
		if(sum==target) {
			res.add(new ArrayList<>(cur));
			return;
		}
		for(int i=start;i<candidates.length;i++)
		{
			int num=candidates[i];
				if(sum+num<=target)
				{
					cur.add(num);
					backtrack(cur,target,candidates,res, sum+num,i);
					cur.remove(cur.size() - 1);
				}
		}
	}

}
