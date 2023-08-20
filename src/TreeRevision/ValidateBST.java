package TreeRevision;

import Trees.ValidateBST.TreeNode;

public class ValidateBST {
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
		TreeNode root=new TreeNode(2);
		TreeNode left=new TreeNode(1);
		TreeNode right=new TreeNode(5);
		root.left=left;
		root.right=right;
		System.out.println(isValidBST(root, Integer.MIN_VALUE,Integer.MAX_VALUE ));
	}
	private static boolean isValidBST(TreeNode root, int minValue, int maxValue) {
		// TODO Auto-generated method stub
		if(root==null)
			return true;
		if(root.data<minValue || root.data>maxValue)
		{
			return false;
		}
		return isValidBST(root.left,minValue,root.data)  &&  isValidBST(root.right,root.data,maxValue);
	}

}
