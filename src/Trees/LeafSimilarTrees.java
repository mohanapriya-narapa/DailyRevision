package Trees;

import java.util.LinkedList;
import java.util.List;

public class LeafSimilarTrees {
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
		TreeNode root=new TreeNode(1);
		TreeNode first=new TreeNode(2);
		TreeNode second=new TreeNode(3);
		TreeNode third=new TreeNode(4);
		TreeNode fourth=new TreeNode(5);
		root.left=first;
		root.right=second;
		first.left=third;
		first.right=fourth;
		TreeNode root1=new TreeNode(1);
		TreeNode first1=new TreeNode(2);
		TreeNode second1=new TreeNode(3);
		TreeNode third1=new TreeNode(4);
		TreeNode fourth1=new TreeNode(5);
		root1.left=first1;
		root1.right=second1;
		first1.left=third1;
		first1.right=fourth1;
		System.out.println(LeafSimilarTrees(root, root1));
	}
	private static boolean LeafSimilarTrees(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		List<Integer> first=new LinkedList<Integer>();
		List<Integer> second=new LinkedList<Integer>();
		dfs(root1, first);
		dfs(root2, second);
		return first.equals(second);
	}
	private static void dfs(TreeNode root, List<Integer> first) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		if(root.left!=null && root.right!=null)
		{
			first.add(root.data);
		}
		dfs(root.left,first);
		dfs(root.right,first);
	}

}
