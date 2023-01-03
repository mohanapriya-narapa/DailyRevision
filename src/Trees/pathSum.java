package Trees;

import Trees.SubTree.TreeNode;

public class pathSum {
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
		TreeNode root1=new TreeNode(1);
		TreeNode left1=new TreeNode(2);
		TreeNode right1=new TreeNode(3);
		root1.left=left1;
		root1.right=right1;
		System.out.println(pathSum(root1, 3));
	}

	private static boolean pathSum(TreeNode root, int target) {
		// TODO Auto-generated method stub
if(root==null)
{
	return false;
}
else if(root.left==null && root.right==null && (target-root.data==0))
{
	return true;
}
return (pathSum(root.left, target-root.data) || pathSum(root.right, target-root.data));
	}

}
