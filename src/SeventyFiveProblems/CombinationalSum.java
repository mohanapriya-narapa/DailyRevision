package SeventyFiveProblems;
import java.util.*;
public class CombinationalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] candidates=new int[] {2,3,6,7};
int target=7;
List<Integer> cur=new LinkedList<Integer>();
List<List<Integer>> result=new LinkedList<>();
combinationalSum(candidates, cur, result, target, 0, 0);
System.out.println(result);
	}

	private static void combinationalSum(int[] candidates, List<Integer> cur, List<List<Integer>> res,
			int target, int start, int sum) {
		// TODO Auto-generated method stub
		if(sum==target)
		{
			res.add(new LinkedList<>(cur));
			return;
		}
		for(int i=start;i<candidates.length;i++)
		{
			int num=candidates[i];
			if(sum+num<=target) {
				cur.add(num);
				combinationalSum(candidates, cur, res, target, i, sum+num);
				cur.remove(cur.size()-1);
			}
		}
		return;
	}

}
