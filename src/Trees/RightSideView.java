package Trees;

import java.util.LinkedList;
import java.util.List;

import Trees.LevelOrderTraversal.TreeNode;

public class RightSideView {

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
		System.out.println(rightSideView(root));
	}
static List<Integer> rightSide=new LinkedList<Integer>();
	private static List<Integer> rightSideView(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return null;
		helper(root, 0);
		return rightSide;
	}

	private static void helper(TreeNode root, int level) {
		// TODO Auto-generated method stub
		if(root==null)return;
		if(level==rightSide.size())
		{
			rightSide.add(root.data);
		}
		helper(root.right, level+1);
		helper(root.left, level+1);
	}

}
