package TreeRevision;

import TreeRevision.heightTree.TreeNode;

public class MinTree {
	public static class TreeNode
	{
		TreeNode left;
		TreeNode right;
		int data;
		public TreeNode(int data)
		{
			this.data=data;
			this.right=null;
			this.left=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		TreeNode left=new TreeNode(4);
		TreeNode right=new TreeNode(5);
		TreeNode leftchild1=new TreeNode(1);
		TreeNode leftchild2=new TreeNode(2);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
		System.out.println(minTree(root));
	}
	private static int minTree(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		int left=minTree(root.left);
		int right=minTree(root.right);
		return Math.min(left,right)+1;
	}

}
