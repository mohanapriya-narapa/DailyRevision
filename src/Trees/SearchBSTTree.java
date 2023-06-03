package Trees;

import Trees.InvdertTreeRecursive.TreeNode;

public class SearchBSTTree {
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
		TreeNode leftchild1=new TreeNode(4);
		TreeNode leftchild2=new TreeNode(12);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
	System.out.println(SearchBST(root, 4));
	}
	private static int SearchBST(TreeNode root, int val) {
		// TODO Auto-generated method stub
		if(root==null)
		return -1;
		if(root.data>val)
		{
			return SearchBST(root.left, val);
		}
		else if(root.data<val)
		{
			return SearchBST(root.right, val);
		}
		else if(root.data==val)
		{
			return root.data;
		}
		else
		{
			return -1;
		}
	}

}
