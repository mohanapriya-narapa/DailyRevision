package Trees;

import Trees.LowestCommonAncestor.TreeNode;

public class LowestCommonAncenstor {
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
		TreeNode root=new TreeNode(6);
		TreeNode left=new TreeNode(2);
		TreeNode right=new TreeNode(8);
		root.left=left;
		root.right=right;
		TreeNode result=LowestCommonAncestor(root,root,right);
		System.out.println(result.data);
	}
	private static TreeNode LowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// TODO Auto-generated method stub
		if(root==null)
		return null;
		if(root==p || root==q)
		{
			return root;
		}
		TreeNode left=LowestCommonAncestor(root.left, p, q);
		TreeNode right=LowestCommonAncestor(root.right, p, q);
		if(left!=null && right!=null)
		{
			return root;
		}
		return left!=null?left:right;
	}

}
