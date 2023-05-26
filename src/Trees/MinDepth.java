package Trees;

import Trees.MergeTrees.TreeNode;

public class MinDepth {
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
		TreeNode left=new TreeNode(9);
		TreeNode right=new TreeNode(20);
		TreeNode leftchild1=new TreeNode(15);
		TreeNode leftchild2=new TreeNode(7);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
		System.out.println(minDepth(root));
	}
	private static int minDepth(TreeNode root) {
		// TODO Auto-generated method stub
if(root==null)return 0;
if(root.left==null)return 1+minDepth(root.right);
if(root.right==null)return 1+minDepth(root.left);
return Math.min(1+minDepth(root.right),1+minDepth(root.left));
	}

}
