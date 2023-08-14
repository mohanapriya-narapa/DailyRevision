package TreeRevision;

import Trees.InvdertTreeRecursive.TreeNode;

public class BalancedBinaryTree {
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
		TreeNode root=new TreeNode(15);
		TreeNode left=new TreeNode(10);
		TreeNode right=new TreeNode(22);
		TreeNode leftchild1=new TreeNode(4);
		TreeNode leftchild2=new TreeNode(12);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
		System.out.println(isBalanced(root));
	}
	private static boolean isBalanced(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return true;
		int lh=height(root.left);
		int rh=height(root.right);
		return (Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right));
	}
	private static int height(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return 0;
		}
		int left=height(root.left);
		int right=height(root.right);
		return Math.max(left,right)+1;
				
	}
	

}
