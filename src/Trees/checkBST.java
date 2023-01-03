package Trees;
import java.util.*;
public class checkBST {
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
		TreeNode root1=new TreeNode(1);
		TreeNode left1=new TreeNode(2);
		TreeNode right1=new TreeNode(1);
		TreeNode root2=new TreeNode(1);
		TreeNode left2=new TreeNode(2);
		TreeNode right2=new TreeNode(1);
		root1.left=left1;
		root1.right=right1;
		System.out.println(validateBST(root1));
	}
	private static boolean validateBST(TreeNode root) {
		// TODO Auto-generated method stub
if(root==null)
{
	return true;
}
if(root.left!=null && root.left.data>root.data)
{
	return false;
}
if(root.right!=null && root.right.data<root.data)
{
	return false;
}
if(!validateBST(root.left) || validateBST(root.left))
{
	return false;
}
return true;

	}

}
