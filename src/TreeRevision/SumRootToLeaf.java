package TreeRevision;

import TreeRevision.ListOfDepths.TreeNode;

public class SumRootToLeaf {
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
	public static int rootToLeaf=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(1);
		TreeNode first=new TreeNode(2);
		TreeNode second=new TreeNode(3);
		root.left=first;
		root.right=second;
		
		sumRootToLeaf(root,0);
		System.out.println(rootToLeaf);
	}
	private static void sumRootToLeaf(TreeNode root, int cur) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		if(root!=null)
			cur=cur*10+root.data;
		if(root.left==null && root.right==null)
		{ 
			rootToLeaf+=cur;	
		}
		sumRootToLeaf(root.left,cur);
		sumRootToLeaf(root.right,cur);
	}

}
