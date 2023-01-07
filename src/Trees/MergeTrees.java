package Trees;

import Trees.isSameTree.TreeNode;

public class MergeTrees {
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
		TreeNode left=new TreeNode(4);
		TreeNode leftchild1=new TreeNode(1);
		TreeNode leftchild2=new TreeNode(2);
		left.left=leftchild1;
		left.right=leftchild2;
		TreeNode root1=new TreeNode(2);
		TreeNode left1=new TreeNode(6);
		TreeNode right1=new TreeNode(2);
		root1.left=left1;
		root1.right=right1;
		TreeNode result=mergeTree(left,root1);
		inorderTraversal(result);
		
	}
	private static void inorderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return;
		}
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);
	}
	private static TreeNode mergeTree(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root1==null)
		{
			return root2;
		}
		if(root2==null)
		{
			return root1;
		}
		root1.data+=root2.data;
		root1.left=mergeTree(root1.left, root2.left);
		root1.right=mergeTree(root1.right, root2.right);
		return root1;
	}

}
