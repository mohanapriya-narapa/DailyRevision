package SeventyFiveProblems;
import java.util.*;
public class SubSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,2,3};
List<List<Integer>> res= new LinkedList<>();
List<Integer> cur=new LinkedList<>();
backtracking(nums, res, cur, 0);
System.out.println(res);
	}

	private static void backtracking(int[] nums, List<List<Integer>> res, List<Integer> cur, int start) {
		// TODO Auto-generated method stub
		if(start>nums.length)
		{
			return;
		}
		res.add(new LinkedList<>(cur));
		for(int i=start;i<nums.length;i++)
		{
			cur.add(nums[i]);
			backtracking(nums, res,cur,i+1);
			cur.remove(cur.size()-1);
		}
	}

}
