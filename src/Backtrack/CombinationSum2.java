package Backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<List<Integer>> res=new LinkedList<>();
		  Backtracking(res,9, new LinkedList<>(), 1,0,3);
		  System.out.println(res);

	}
    public static void Backtracking(List<List<Integer>> res, int target, List<Integer> cur, int start, int sum,int k)
    {
    	if(sum==target && cur.size()==k) {
			res.add(new ArrayList<>(cur));
			return;
		}
        else
        {
           for(int i=start;i<target;i++)
           {
               int num=i;
				if(sum+num<=target)
				{
					cur.add(num);
					Backtracking(res,target,cur, i+1,sum+num,k);
					cur.remove(cur.size() - 1);
				}
           }
        }
    }
}
