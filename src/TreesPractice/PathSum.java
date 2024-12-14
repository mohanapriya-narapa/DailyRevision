package TreesPractice;

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
		TreeNode root=new TreeNode(15);
		TreeNode left=new TreeNode(10);
		TreeNode right=new TreeNode(22);
	
		root.left=left;
		root.right=right;

		System.out.println(hasPathSum(root,25));
	}
	private static boolean hasPathSum(TreeNode root, int target) {
		// TODO Auto-generated method stub
		if(root==null)
			return false;
		else if(root.left==null && root.right==null && (target-root.data==0))
		{
			return true;
		}
		return hasPathSum(root.left, target-root.data) ||  hasPathSum(root.right, target-root.data);
	}

}
