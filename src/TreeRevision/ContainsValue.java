package TreeRevision;

import Trees.MinDepth.TreeNode;

public class ContainsValue {
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
		TreeNode root=new TreeNode(3);
		TreeNode left=new TreeNode(4);
		TreeNode right=new TreeNode(5);
		TreeNode leftchild1=new TreeNode(1);
		TreeNode leftchild2=new TreeNode(2);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
		System.out.println(containsValue(root,5));
	}
	private static boolean containsValue(TreeNode root,int data) {
		// TODO Auto-generated method stub
		if(root==null)
			return false;
		boolean left=containsValue(root.left,data);
		boolean right=containsValue(root.right,data);
		return root.data==data || left || right;
	}

}
