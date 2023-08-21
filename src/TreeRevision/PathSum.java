package TreeRevision;

import TreeRevision.LevelOrder.TreeNode;

public class PathSum {
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
		System.out.println(hasPathSum(root, 4));  
		
	}
	private static boolean hasPathSum(TreeNode root, int targetSum) {
		// TODO Auto-generated method stub
		if(root==null)
			return false;
		if(root.left==null && root.right==null && targetSum-root.data==0 )
			return true;
		return (hasPathSum(root.left, targetSum-root.data) || hasPathSum(root.right, targetSum-root.data) );
	}

}
