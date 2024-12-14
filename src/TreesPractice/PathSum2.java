package TreesPractice;
import java.util.*;
import TreesPractice.SumRootToLeaf.TreeNode;

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
		TreeNode root=new TreeNode(15);
		TreeNode left=new TreeNode(10);
		TreeNode right=new TreeNode(12);
	
		root.left=left;
		root.right=right;
		List<List<Integer>> res= pathSum(root, 25);
System.out.println(res);
	}
	private static List<List<Integer>> pathSum(TreeNode root, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> pathList=new LinkedList<>();
		List<Integer> pathNodes=new LinkedList<>();
		recurseTree(root,target, pathNodes, pathList);
		return pathList;
	}
	private static void recurseTree(TreeNode root, int target, List<Integer> pathNodes, List<List<Integer>> pathList) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		pathNodes.add(root.data);
		if(root.data==target && root.left==null && root.right==null)
		{
			pathList.add(new LinkedList<>(pathNodes));
		}
		else {
			recurseTree(root.left,target-root.data, pathNodes, pathList);
			recurseTree(root.right,target-root.data, pathNodes, pathList);
		}
		pathNodes.remove(pathNodes.size()-1);
	}

}
