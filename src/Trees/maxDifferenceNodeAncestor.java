package Trees;

import Trees.LevelOrderTraversal.TreeNode;

public class maxDifferenceNodeAncestor {
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
		TreeNode root=new TreeNode(8);
		TreeNode first=new TreeNode(3);
		TreeNode second=new TreeNode(10);
		root.left=first;
		root.right=second;
		System.out.println(maxDifference(root, root.data,root.data));
	
	}
	private static int maxDifference(TreeNode root, int curmax, int curmin) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return curmax-curmin;
		}
		curmax=Math.max(curmax,root.data);
		curmin=Math.min(curmin,root.data);
		int left=maxDifference(root.left,curmax,curmin);
		int right=maxDifference(root.right,curmax,curmin);
		return Math.max(left,right);
	}

}
