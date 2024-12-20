package TreesPractice;

public class BinaryTreeMaxPathSum {
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
	public static int maxSum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		TreeNode left=new TreeNode(2);
		TreeNode right=new TreeNode(3);
		root.left=left;
		root.right=right;
		 System.out.println(maxPathSum(root));
	}
	private static int maxPathSum(TreeNode root) {
		// TODO Auto-generated method stub
		maxSum=Integer.MIN_VALUE;
		gainFromSubTree(root);
		return maxSum;
	}
	private static int gainFromSubTree(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) return 0;
		int gainsFromLeft=Math.max(gainFromSubTree(root.left), 0);
		int gainsFromRight=Math.max(gainFromSubTree(root.right), 0);
		maxSum=Math.max(maxSum, gainsFromLeft+gainsFromRight+root.data);
		return Math.max(gainsFromLeft+root.data, gainsFromRight+root.data);
	}

}
