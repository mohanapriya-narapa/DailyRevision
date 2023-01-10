package Trees;
import java.util.*;

import Trees.LowestCommonAncestor.TreeNode;
public class PreOrderIterativeTraversal {
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
		PreorderIterativeTraversal(root);
	}
	private static void PreorderIterativeTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		Stack<TreeNode> st=new Stack<TreeNode>();
		st.push(root);
		while(!st.isEmpty())
		{
			TreeNode result=st.pop();
			System.out.println(result.data);
			if(result.right!=null)
			st.push(result.right);
			if(result.left!=null)
			st.push(result.left);
		}
	}

}
