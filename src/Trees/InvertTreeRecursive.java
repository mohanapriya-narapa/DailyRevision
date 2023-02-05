package Trees;

import Trees.BinaryTreeUpsideDown.TreeNode;

public class InvertTreeRecursive {
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
		
		InorderTraversal(InvertTreeRecursive(root));
	}
	private static void InorderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)return;
		System.out.println(root.data);
		InorderTraversal(root.left);
		InorderTraversal(root.right);
		//recusive
	}
	private static TreeNode InvertTreeRecursive(TreeNode root) {
		// TODO Auto-generated method stub
	if(root==null) return null;
	TreeNode left=InvertTreeRecursive(root.right);
	TreeNode right=InvertTreeRecursive(root.left);
	root.left=left;
	root.right=right;
	return root;
	}

}
