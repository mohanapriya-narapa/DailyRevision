package Trees;

import java.util.LinkedList;
import java.util.List;

import Trees.SearchBSTTree.TreeNode;

public class LeafSimilar {
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
		TreeNode left=new TreeNode(4);
		TreeNode leftchild1=new TreeNode(1);
		TreeNode leftchild2=new TreeNode(2);
		left.left=leftchild1;
		left.right=leftchild2;
		TreeNode root1=new TreeNode(4);
		TreeNode left1=new TreeNode(1);
		TreeNode right1=new TreeNode(2);
		root1.left=left1;
		root1.right=right1;
		System.out.println(LeafSimilar(left, root1));
		
	}
	private static boolean LeafSimilar(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
//		return null;
		List<Integer> first=new LinkedList<>();
		List<Integer> second=new LinkedList<>();
		dfs(first,root1);
		dfs(second,root2);
		return first.equals(second);
	}
	private static void dfs(List<Integer> first, TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		if(root.left==null && root.right==null)
			first.add(root.data);
		dfs(first,root.left);
		dfs(first,root.right);
		
	}

}
