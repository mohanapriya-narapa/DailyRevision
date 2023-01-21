package Trees;

import java.util.LinkedList;
import java.util.List;

import Trees.LevelOrderTraversal.TreeNode;

public class PathSum2 {
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
		TreeNode root=new TreeNode(5);
		TreeNode first=new TreeNode(4);
		TreeNode second=new TreeNode(4);
//		TreeNode third=new TreeNode(11);
//		TreeNode fourth=new TreeNode(7);
		root.left=first;
		root.right=second;
//		first.left=third;
//		third.left=fourth;
		pathSum2(root, 9);
	}
	private static void pathSum2(TreeNode root, int target) {
		// TODO Auto-generated method stub
		  List<List<Integer>> pathList=new LinkedList<List<Integer>>();
		  List<Integer> pathNodes=new LinkedList<Integer>();
		recurseTree(root, target, pathNodes, pathList);
		System.out.println(pathList);	
	}
	private static void recurseTree(TreeNode root, int remainingSum, List<Integer> pathNodes, List<List<Integer>> pathList) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		pathNodes.add(root.data);
		if(root.data==remainingSum && root.left==null && root.right==null)
		{
			pathList.add(new LinkedList<>(pathNodes));
			
		}
		else
		{
			recurseTree(root.left,remainingSum-root.data,pathNodes,pathList);
			recurseTree(root.right,remainingSum-root.data,pathNodes,pathList);
		}
		pathNodes.remove(pathNodes.size()-1);
	}

}
