package Trees;

import Trees.checkBST.TreeNode;

public class SearchBST {
	public static class TreeNode
	{
		private int data;
		private TreeNode left;
		private TreeNode right;
		public TreeNode(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		TreeNode left=new TreeNode(4);
		TreeNode right=new TreeNode(5);
		TreeNode leftchild1=new TreeNode(1);
		TreeNode leftchild2=new TreeNode(2);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
		System.out.println(SearchBST(root,5));
	}
	private static  int SearchBST(TreeNode root, int val) {
		// TODO Auto-generated method stub
		if(root.data>val)
		{
			return SearchBST(root.left, val);
		}
		else if (root.data<val)
		{
			return SearchBST(root.right, val);	
		}
		else if(root.data==val)
		{
			return root.data;
		}
		else
		{
			return 0;
		}
		
	}

}
