package TreeRevision;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import Trees.SerializeAndDeserialize.TreeNode;

public class SerializeAndDeserialize {
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
		TreeNode root=new TreeNode(3);
		TreeNode left=new TreeNode(9);
		TreeNode right=new TreeNode(20);
		TreeNode rightchild1=new TreeNode(15);
		TreeNode rightchild2=new TreeNode(7);
		root.left=left;
		root.right=right;
		right.left=rightchild1;
		right.right=rightchild2;
		TreeNode result=deserialize(Serialize(root));
		print(result);
		
	}
	private static void print(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)return;
		System.out.println(root.data);
		print(root.left);
		print(root.right);
	}
	private static String Serialize(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return "#";
		StringBuilder sb=new StringBuilder();
		sb.append(String.valueOf(root.data));
		sb.append(',');
		sb.append(Serialize(root.left));
		sb.append(',');
		sb.append(Serialize(root.right));
		
		return sb.toString();
	}
	  public static TreeNode deserialize(String data) {
	        String[] arr = data.split(",");
	        List<String> nodes = new LinkedList<>(Arrays.asList(arr));
	        return deserializeHelper(nodes);
	    }
	private static TreeNode deserializeHelper(List<String> nodes) {
		// TODO Auto-generated method stub
		if(nodes ==null)
			return null;
		if(nodes.get(0).equals("#"))
		{
			nodes.remove(0);
			return null;
		}
		int val=Integer.valueOf(nodes.get(0));
		nodes.remove(0);
		TreeNode root=new TreeNode(val);
		root.left=deserializeHelper(nodes);
		root.right=deserializeHelper(nodes);
		
		return root;
	}
}
