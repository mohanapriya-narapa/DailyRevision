package Trees;

import java.util.Stack;

import Trees.SearchBST.TreeNode;
//geeks for geeks reference
public class ZigZagTraversal {
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
		ZigZagTraversal(root);
	}
	private static void ZigZagTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)return ;
		Stack<TreeNode> curStack=new Stack<TreeNode>();
		Stack<TreeNode> nextStack=new Stack<TreeNode>();
		curStack.push(root);
		boolean leftToRight=true;
		while(!curStack.isEmpty())
		{
			TreeNode node=curStack.pop();
			System.out.println(node.data);
			if(leftToRight)
			{
				if(node.left!=null)
				{
					nextStack.push(node.left);
				}
				if(node.right!=null)
				{
					nextStack.push(node.right);
				}
			}
			else
			{
				if(node.right!=null)
				{
					nextStack.push(node.right);
				}
				if(node.left!=null)
				{
					nextStack.push(node.left);
				}
				
			}
			if(curStack.isEmpty())
			{
				leftToRight=!leftToRight;
				Stack<TreeNode> temp=nextStack;
						
						nextStack=curStack;
				curStack=temp;
			}
		}
		
		
	}

}
