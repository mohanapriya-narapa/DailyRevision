package Trees;

import Trees.LeafSimilarTrees.TreeNode;

public class CountUnivalueSubtrees {
	static int count=0;
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
		TreeNode root=new TreeNode(5);
		TreeNode left=new TreeNode(1);
		TreeNode right=new TreeNode(5);
		TreeNode leftchild1=new TreeNode(5);
		TreeNode leftchild2=new TreeNode(5);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
		System.out.println(CountUnivalueSubtrees(root));
	}
	private static int CountUnivalueSubtrees(TreeNode root) {
		// TODO Auto-generated method stub
isValid(root,0);
return count;
	}
	private static boolean isValid(TreeNode root, int val) {
		// TODO Auto-generated method stub
		if(root==null) return true;
		if(!isValid(root.left, val) | !isValid(root.right, val))
		{
			return false;
		}
		count++;
			return root.data==val;
	}

}
