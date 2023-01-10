package Trees;

import Trees.PostOrderIterative.TreeNode;

public class PathWithSum {
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
		System.out.println(hasPathSum(root,29));
	}
	private static boolean hasPathSum(TreeNode root, int targetSum) {
		// TODO Auto-generated method stub
		if(root==null)
			return false;
		else if(root.left!=null && root.right!=null && (targetSum-root.data)==0)
		{
			return true;
		}
		return (hasPathSum(root.left,targetSum-root.data) || hasPathSum(root.right,targetSum-root.data));
	}

}
