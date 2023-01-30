package Trees;

import Trees.BinaryTreeMaximumPathSum.TreeNode;

public class ConvertSortedArrayBinarySearchTree {
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
		
		int[] nums=new int[] { -10,-3,0,5,9};
		 printTree(maxPathSum(nums));
	}
	private static void printTree(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
	private static TreeNode maxPathSum(int[] nums) {
		// TODO Auto-generated method stub
return makeTree(nums, 0, nums.length-1);
	}
	private static TreeNode makeTree(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
if(nums==null && nums.length==0)
{
	return null;
}
if(start>end)
	return null;
int mid=(start+end)/2;
TreeNode root=new TreeNode(nums[mid]);
root.left=makeTree(nums,start, mid-1);
root.right=makeTree(nums,mid+1, end);
return root;
	}

}
