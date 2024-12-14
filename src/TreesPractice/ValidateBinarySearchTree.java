package TreesPractice;

import TreesPractice.isBalancedTree.TreeNode;

public class ValidateBinarySearchTree {
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
//		TreeNode left=new TreeNode(4);
//		TreeNode right=new TreeNode(5);
		TreeNode left=new TreeNode(1);
		TreeNode right=new TreeNode(5);
		root.left=left;
		root.right=right;
//		left.left=leftchild1;
//		left.right=leftchild2;
		System.out.println(isBinarySearchTree(root));
	}
	private static boolean isBinarySearchTree(TreeNode root) {
		// TODO Auto-generated method stub
		return validate(root, null, null);
	}
	private static boolean validate(TreeNode root, Integer min, Integer max) {
		// TODO Auto-generated method stub
		if(root==null) return true;
		if((min!=null && root.data<=min) || (max!=null && root.data>=max))
		{
			return false;
		}
		return validate(root.left, min, root.data) && validate(root.right,root.data, max);
	}

}
