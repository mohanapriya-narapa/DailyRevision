package Trees;

import Trees.MInDistanceNodes.TreeNode;

public class Diameter {
	public static int diameter;
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
		diameter=0;
		System.out.println(longestPath(root));
	}
	private static int longestPath(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return 0;
		}
		int left=longestPath(root.left);
		int right=longestPath(root.right);
		diameter=Math.max(diameter, left+right);
		return Math.max(left,right)+1;
	}

}
