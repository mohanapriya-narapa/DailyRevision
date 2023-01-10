package Trees;

import java.util.Stack;

import Trees.InorderTraversalIterative.TreeNode;

public class PostOrderIterative {
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
		TreeNode root=new TreeNode(15);
		TreeNode left=new TreeNode(10);
		TreeNode right=new TreeNode(22);
		TreeNode leftchild1=new TreeNode(4);
		TreeNode leftchild2=new TreeNode(12);
		root.left=left;
		root.right=right;
		left.left=leftchild1;
		left.right=leftchild2;
		PostIterativeTraversal(root);
	}
	private static void PostIterativeTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		Stack<TreeNode> st1= new Stack<TreeNode>();
		Stack<TreeNode> st2= new Stack<TreeNode>();
		if(root==null)
		{
			return;
		}
		st1.push(root);
		while(!st1.isEmpty())
		{
			TreeNode temp=st1.pop();
			st2.push(temp);
			if(temp.left!=null)
			{
				st1.push(temp.left);
			}
			if(temp.right!=null)
			{
				st1.push(temp.right);
			}
			
		}
		while(!st2.isEmpty())
		{TreeNode result=st2.pop();
			System.out.println(result.data);
		}
		
	}

}
