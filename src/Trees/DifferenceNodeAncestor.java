package Trees;

import Trees.MinDepth.TreeNode;

public class DifferenceNodeAncestor {
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
		TreeNode root=new TreeNode(8);
		TreeNode left=new TreeNode(3);
		TreeNode right=new TreeNode(10);
		TreeNode leftchild1=new TreeNode(1);
		TreeNode leftchild2=new TreeNode(6);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
		System.out.println(differenceNode(root));
	}
	private static int differenceNode(TreeNode root) {
		// TODO Auto-generated method stub
if(root==null)return 0;
return helper(root,root.data,root.data);
	}
	private static int helper(TreeNode root, int curMax, int curMin) {
		// TODO Auto-generated method stub
		if(root==null)return curMax-curMin;
		curMax=Math.max(curMax,root.data);
		curMin=Math.min(curMin,root.data);
		int left=helper(root.left,curMax,curMin);
		int right=helper(root.right,curMax,curMin);
		return Math.max(left,right);
	}

}
