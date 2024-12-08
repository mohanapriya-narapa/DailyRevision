package SeventyFiveProblems;
import java.util.*;
public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<List<Integer>> res=new LinkedList<>();
int target=9;
backtracking(res, new LinkedList<>(),target, 1, 0, 3 );
System.out.println(res);

	}

	private static void backtracking(List<List<Integer>> res, List<Integer> cur, int target, int start, int sum, int k) {
		// TODO Auto-generated method stub
		if(sum==target && cur.size()==k)
		{
			res.add(new LinkedList<>(cur));
		return;
		}
		else {
			for(int i=start;i<target;i++)
			{
				cur.add(i);
				backtracking(res, cur, target, i+1, sum+i, k);
				cur.remove(cur.size()-1);
			}
		}
	}

}
