package TreeRevision;

import Trees.InvertTreeRecursive.TreeNode;

public class SymmetricTree {
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
		TreeNode left=new TreeNode(2);
		TreeNode right=new TreeNode(2);
		root.left=left;
		root.right=right;
		
		System.out.println(symmetricTree(root, root));
	}
	private static boolean symmetricTree(TreeNode root1, TreeNode root2) {
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
		return symmetricTree(root1.left,root2.right) &&  symmetricTree(root1.right,root2.left);
	}

}
