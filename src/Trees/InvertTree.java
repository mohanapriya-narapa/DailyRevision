package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {
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
		print(InvertTree(root));
	}
	

	private static void print(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)return;
		System.out.println(root.data);
		print(root.left);
		print(root.right);
	}


	private static TreeNode InvertTree(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)return null;
		Queue<TreeNode> qu=new LinkedList<>();
		
		qu.add(root);
		while(!qu.isEmpty())
		{
			TreeNode cur=qu.poll();
			TreeNode temp=cur.left;
			cur.left=cur.right;
			cur.right=temp;
			if(cur.left!=null)qu.add(cur.left);
			if(cur.right!=null) qu.add(cur.right);
			
		}return root;
	}

}
