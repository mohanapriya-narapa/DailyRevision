package TreeRevision;

import Trees.LevelOrderTraversalTree.TreeNode;
import java.util.*;
public class LevelOrder {
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
		levelOrderTraversal(root);
	}
	private static void levelOrderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		Queue<TreeNode> qu=new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty())
		{
			TreeNode node=qu.poll();
			System.out.println(node.data);
			if(node.left!=null)
			{
				qu.add(node.left);		
			}
			if(node.right!=null)
			{
				qu.add(node.right);		
			}
			
		}
	}

}
