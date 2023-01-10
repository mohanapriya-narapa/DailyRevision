package Trees;

import java.util.Stack;

import Trees.PreOrderIterativeTraversal.TreeNode;

public class InorderTraversalIterative {
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
		InorderIterativeTraversal(root);
	}
	private static void InorderIterativeTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		Stack<TreeNode> st=new Stack<TreeNode>();
		TreeNode cur=root;
		while(cur!=null || !st.isEmpty())
		{
			if(cur!=null)
			{
				st.push(cur);
				cur=cur.left;
			}
			else
			{
				cur=st.pop();
				System.out.println(cur.data);
				cur=cur.right;
				
			}
		}
		
	}

}
