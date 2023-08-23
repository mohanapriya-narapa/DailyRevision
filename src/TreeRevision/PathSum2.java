package TreeRevision;
import java.util.*;

public class PathSum2 {
	public static class TreeNode
	{
		public int data;
		public TreeNode left;
		public TreeNode right;
		public TreeNode(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		TreeNode first=new TreeNode(2);
		TreeNode second=new TreeNode(2);
		root.left=first;
		root.right=second;
		System.out.println(hasPathSum(root, 3));  
	}
	private static List<List<Integer>> hasPathSum(TreeNode root, int sum) {
		// TODO Auto-generated method stub
		List<List<Integer>> result=new LinkedList<>();
		List<Integer> cur=new LinkedList<>();
		recurseTree(root, sum, result, cur);
		return result;
	}
	private static void recurseTree(TreeNode root, int sum, List<List<Integer>> result, List<Integer> cur) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		cur.add(root.data);
		if(root.data==sum && root.left==null && root.right==null)
		{
			result.add(cur);
			return;
		}
		recurseTree(root.left, sum-root.data,result, new LinkedList<Integer>(cur));
		recurseTree(root.right, sum-root.data,result, new LinkedList<Integer>(cur) );
	}

}
