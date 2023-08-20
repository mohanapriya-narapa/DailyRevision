package TreeRevision;

import TreeRevision.LevelOrder.TreeNode;

public class Diameter {
	private static int diameter;
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
		TreeNode first=new TreeNode(2);
		TreeNode second=new TreeNode(3);
		TreeNode third=new TreeNode(4);
		TreeNode fourth=new TreeNode(5);
		root.left=first;
		root.right=second;
		first.left=third;
		first.right=fourth;
		diameter=0;
		longestPath(root);
		System.out.println(diameter);
	}
	private static int longestPath(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		int left=longestPath(root.left);
		int right=longestPath(root.right);
		diameter=Math.max(left+right,diameter);
		return Math.max(left,right)+1;
	}

}
