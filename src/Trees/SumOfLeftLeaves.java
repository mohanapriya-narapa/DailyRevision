package Trees;

import java.util.*;

public class SumOfLeftLeaves {
	public static int sum=0;
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
		TreeNode root=new TreeNode(3);
		TreeNode left=new TreeNode(4);
		TreeNode right=new TreeNode(5);
		TreeNode leftchild1=new TreeNode(1);
		TreeNode leftchild2=new TreeNode(2);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
		System.out.println(sumLeftLeaves(root));
	}
	private static int sumLeftLeaves(TreeNode root) {
		// TODO Auto-generated method stub

if(root==null)
	return 0;
if(root.left!=null && root.left.left==null && root.left.right==null)
{
	sum+=root.left.data;
}
sumLeftLeaves(root.left);
sumLeftLeaves(root.right);
return sum;
	}

}
