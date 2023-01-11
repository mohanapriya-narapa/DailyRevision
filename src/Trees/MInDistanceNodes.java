package Trees;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import Trees.PathWithSum.TreeNode;

public class MInDistanceNodes {
	public static List<Integer> vals;
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
		System.out.println(minDistanceNodes(root));
	}
	private static int minDistanceNodes(TreeNode root) {
		// TODO Auto-generated method stub
		vals=new LinkedList<Integer>();
		dfs(root);
		Collections.sort(vals);
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<vals.size()-1;i++)
		{
			ans=Math.min(ans, vals.get(i+1)-vals.get(i));
		}
		
		return ans;
	}
	private static void dfs(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		vals.add(root.data);
		dfs(root.left);
		dfs(root.right);
	}

}
