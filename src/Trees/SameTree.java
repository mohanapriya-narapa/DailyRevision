package Trees;

import Trees.InvertTreeRecursive.TreeNode;

public class SameTree {
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
		TreeNode left=new TreeNode(4);
		TreeNode leftchild1=new TreeNode(1);
		TreeNode leftchild2=new TreeNode(3);
		left.left=leftchild1;
		left.right=leftchild2;
		TreeNode root1=new TreeNode(4);
		TreeNode left1=new TreeNode(1);
		TreeNode right1=new TreeNode(2);
		root1.left=left1;
		root1.right=right1;
		System.out.println(isSameTree(left,root1));
	}
	private static boolean isSameTree(TreeNode p, TreeNode q) {
		// TODO Auto-generated method stub
		if(p==null && q==null )
			return true;
		if(p==null || q==null)return false;
		if(p.data!=q.data)
		{
			return false;
		}
		return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	}

}
