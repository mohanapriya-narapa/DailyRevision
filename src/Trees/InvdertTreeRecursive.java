package Trees;

import Trees.InvertTree.TreeNode;

public class InvdertTreeRecursive {
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
		print(InvertTree(root));
	}
	private static void print(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)return;
		System.out.println(root.data);
		print(root.left);
		print(root.right);
		
	}
	private static TreeNode InvertTree(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)return null;
		TreeNode left=InvertTree(root.left);
		TreeNode right=InvertTree(root.right);
		root.left=right;
		root.right=left;
		return root;
		
	}

}
