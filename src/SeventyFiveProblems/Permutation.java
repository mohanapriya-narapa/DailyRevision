package SeventyFiveProblems;
import java.util.*;
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,2,3};
List<List<Integer>> res=new LinkedList<>();
List<Integer> cur=new LinkedList<>();
backTracking(res, cur, nums, 0);
System.out.println(res);
	}

	private static void backTracking(List<List<Integer>> res, List<Integer> cur, int[] nums, int start) {
		// TODO Auto-generated method stub
		if(cur.size()==nums.length)
		{
			res.add(new LinkedList<>(cur));
			return;
		}
		for(int i=0;i<nums.length;i++)
		{ if(!cur.contains(nums[i])) {
			cur.add(nums[i]);
			backTracking(res, cur, nums, start);
			cur.remove(cur.size()-1);
		}
		}
	}

}
