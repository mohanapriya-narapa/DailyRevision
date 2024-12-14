package TreesPractice;

import TreesPractice.BinaryTreeMaxPathSum.TreeNode;
import java.util.*;
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
		List<List<Integer>> res=new LinkedList<>();
		listOfDepths(root, res, 0);
//		for(List<Integer> x:res)
//		{
//			for(int y:x)
//			{
//				System.out.print(y);
//			}
//			System.out.println(" ");
//		}
		List<Integer> finalLevel=res.get(res.size()-1);
		for(int y:finalLevel)
		{
			System.out.println(y);
		}
	}
	private static void listOfDepths(TreeNode root, List<List<Integer>> res, int level) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		if(res.size()==level)
		{
			List<Integer> li=new LinkedList<Integer>();
			res.add(li);
		}
		List<Integer> linew=res.get(level);
		linew.add(root.data);
		listOfDepths(root.left, res, level+1);
		listOfDepths(root.right, res, level+1);
	}

}
