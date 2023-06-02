package Trees;

import Trees.SameTree.TreeNode;

public class SymmetricTreeLeetcode {
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
		TreeNode left=new TreeNode(4);
		TreeNode leftchild1=new TreeNode(1);
		TreeNode leftchild2=new TreeNode(2);
		left.left=leftchild1;
		left.right=leftchild2;
		TreeNode root1=new TreeNode(4);
		TreeNode left1=new TreeNode(2);
		TreeNode right1=new TreeNode(1);
		root1.left=left1;
		root1.right=right1;
		System.out.println(isSymmetricTree(left,root1));
	}
	private static boolean isSymmetricTree(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
 if(root1==null && root2==null)
	 return true;
 if(root1==null || root2==null)
	 return false;
 if(root1.data!=root2.data)
 {
	 return false;
 }
	 return isSymmetricTree(root1.left,root2.right) &&  isSymmetricTree(root2.left,root1.right);
	}

}
