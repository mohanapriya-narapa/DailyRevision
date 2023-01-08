package Trees;

import java.util.LinkedList;
import java.util.List;

public class ListOfDepths {
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
		TreeNode root=new TreeNode(3);
		TreeNode left=new TreeNode(9);
		TreeNode right=new TreeNode(20);
		TreeNode rightchild1=new TreeNode(15);
		TreeNode rightchild2=new TreeNode(7);
		root.left=left;
		root.right=right;
		right.left=rightchild1;
		right.right=rightchild2;
		List<List<Integer>> result=new LinkedList<>();
		List<Integer> linew=new LinkedList<>();
		listOfDepths(root,result,0);
		System.out.println(result);
	}

	private static void listOfDepths(TreeNode root, List<List<Integer>> result, int level) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		if(result.size()==level)
		{
			List<Integer> linew=new LinkedList<Integer>();
			result.add(linew);
		}
		List<Integer> li=result.get(level);
		li.add(root.data);
		listOfDepths(root.left, result, level+1);
		listOfDepths(root.right, result, level+1);
	}

}
