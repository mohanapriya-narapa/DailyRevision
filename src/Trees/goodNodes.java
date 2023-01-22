package Trees;

import Trees.LevelOrderTraversal.TreeNode;

public class goodNodes {
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
		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(4);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(5);
		TreeNode fifth=new TreeNode(1);
		root.left=first;
		root.right=second;
		first.left=third;
		second.left=fifth;
		second.right=fourth;
		System.out.println(goodNodes(root));
	}
	private static int goodNodes(TreeNode root) {
		// TODO Auto-generated method stub
		return countGoodNodes(root, root.data);
	}
	private static int countGoodNodes(TreeNode root, int maxSoFar) {
		// TODO Auto-generated method stub
int countGoodNodes=0;
if(root==null)
	return 0;
if(root.data>=maxSoFar)
{
	maxSoFar=root.data;
	countGoodNodes++;
}
countGoodNodes+=countGoodNodes(root.left, maxSoFar);
countGoodNodes+=countGoodNodes(root.right, maxSoFar);
return countGoodNodes;
	}

}
