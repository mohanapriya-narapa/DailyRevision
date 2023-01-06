package Trees;

import Trees.SumOfLeftLeaves.TreeNode;

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
		TreeNode root=new TreeNode(3);
		TreeNode left=new TreeNode(4);
		TreeNode right=new TreeNode(5);
		TreeNode leftchild1=new TreeNode(1);
		TreeNode leftchild2=new TreeNode(2);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
		System.out.println(isBalancedTree(root));
	}
	private static boolean isBalancedTree(TreeNode root) {
		// TODO Auto-generated method stub
if(root==null)
{
	return true;
}
int lh=height(root.left);
int rh=height(root.right);
return Math.abs(lh-rh)<=1 && isBalancedTree(root.left) &&  isBalancedTree(root.right);

	}
	private static int height(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return 0;
		}
int left= height(root.left);
int right=height(root.right);
return Math.max(left,right)+1;
	}

}
