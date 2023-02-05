package Trees;

import Trees.countNodes.TreeNode;

public class BinaryTreeUpsideDown {
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
		TreeNode left=new TreeNode(2);
		TreeNode right=new TreeNode(3);
		root.left=left;
		root.right=right;
		
		inorderTraversal(upsideDownBinaryTree(root));
	}
	private static void inorderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)return;
	System.out.println(root.data);
	inorderTraversal(root.left);
	inorderTraversal(root.right);
	}
	private static TreeNode upsideDownBinaryTree(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null || root.left==null && root.right==null)
		{
			return root;
		}
		TreeNode newRoot=upsideDownBinaryTree(root.left);
		root.left.left=root.right;
		root.left.right=root;
		root.left=null;
		root.right=null;
		return newRoot;
	}

}
