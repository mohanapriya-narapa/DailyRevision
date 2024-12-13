package TreesPractice;

import Trees.isSameTree.TreeNode;

public class SymmetricTree {
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
		TreeNode root=new TreeNode(2);
		TreeNode left=new TreeNode(1);
		TreeNode right=new TreeNode(1);
		root.left=left;
		root.right=right;
//		TreeNode root2=new TreeNode(2);
//		TreeNode left2=new TreeNode(3);
//		TreeNode right2=new TreeNode(1);
//		root2.left=left2;
//		root2.right=right2;
	System.out.println(isSymmetricTree(root,root));
	}
	private static boolean isSymmetricTree(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null)
			return false;
		if(root1.data!=root2.data)
			return false;
		return isSymmetricTree(root1.left, root2.right) &&  isSymmetricTree(root1.right, root2.left);
	}

}
