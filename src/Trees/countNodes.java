package Trees;

import Trees.BinaryTreeMaximumPathSum.TreeNode;

public class countNodes {
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
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		TreeNode left=new TreeNode(2);
		TreeNode right=new TreeNode(3);
		root.left=left;
		root.right=right;
		 System.out.println(countNodes(root));
	}
	private static int countNodes(TreeNode root) {
		// TODO Auto-generated method stub
if(root==null)
	return 0;
return 1+countNodes(root.left)+countNodes(root.right);
	}

}
