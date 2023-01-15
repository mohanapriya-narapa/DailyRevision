package Trees;

import java.util.HashMap;

import Trees.SymmetricTree.TreeNode;

public class TreeFromInorderAndPreorder {
    public static int preIndex=0;
    public static HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
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
int[] preOrder=new int[] {3,9,20,15,7};
int[] inOrder=new int[] {9,3,15,20,7};

TreeNode root=buildTreeWrap(preOrder,inOrder);
printInorder(root);

	}
	private static void printInorder(TreeNode root) {
		// TODO Auto-generated method stub
	if(root==null)
		return;
	System.out.println(root.data);	
	printInorder(root.left);
	
	printInorder(root.right);
	
	}
	private static TreeNode buildTreeWrap(int[] preOrder, int[] inOrder) {
		// TODO Auto-generated method stub
		for(int i=0;i<inOrder.length;i++)
		{
			mp.put(inOrder[i],i);
		}
		return buildTree(preOrder,inOrder, 0, inOrder.length-1 );
	}
	private static TreeNode buildTree(int[] preOrder, int[] inOrder, int inStart, int inEnd) {
		// TODO Auto-generated method stub
		if(inStart>inEnd)
		{
			return null;
		}
		int cur=preOrder[preIndex++];
		TreeNode root;
		root=new TreeNode(cur);
		if(inStart==inEnd)
		{
			return root;
		}
		int inIndex=mp.get(cur);
		root.left= buildTree(preOrder,inOrder, inStart, inIndex-1);
		root.right= buildTree(preOrder,inOrder, inIndex+1, inEnd);
		return root;
	}

}
