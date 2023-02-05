package tenProblemsLeetcodeChallenge;

import java.util.LinkedList;
import java.util.Queue;

import Trees.InvertTreeRecursive.TreeNode;

public class InvertTreeIterative {
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
		TreeNode left=new TreeNode(2);
		TreeNode right=new TreeNode(3);
		root.left=left;
		root.right=right;
		
	InvertTreeRecursive(root);
	}
	private static void InvertTreeRecursive(TreeNode root) {
		// TODO Auto-generated method stub
	Queue<TreeNode> qu=new LinkedList<>();
qu.add(root);
while(!qu.isEmpty())
{
	TreeNode cur=qu.poll();
	System.out.println(cur.data);
	TreeNode temp=cur.left;
	cur.left=cur.right;
	cur.right=temp;
	if(cur.left!=null)qu.add(cur.left);
	if(cur.right!=null)qu.add(cur.right);
}
	
	}

}
