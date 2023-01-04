package Trees;

import Trees.SubTree.TreeNode;

public class isSameTree {
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
		TreeNode root1=new TreeNode(4);
		TreeNode left1=new TreeNode(1);
		TreeNode right1=new TreeNode(2);
		root1.left=left1;
		root1.right=right1;
		System.out.println(isSameTree(left,root1));
	}
	private static boolean isSameTree(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
if(root1==null && root2==null)
{
	return true;
}
if(root1==null || root2==null)
{
	return false;
}
if(root1.data!=root2.data)
{
	return false;
	}
return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
}

}
