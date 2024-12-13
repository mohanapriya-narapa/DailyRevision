package TreesPractice;

public class IsSameTree {
public static class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	TreeNode(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeNode root=new TreeNode(2);
TreeNode left=new TreeNode(1);
TreeNode right=new TreeNode(3);
root.left=left;
root.right=right;
TreeNode root2=new TreeNode(2);
TreeNode left2=new TreeNode(1);
TreeNode right2=new TreeNode(3);
root2.left=left2;
root2.right=right2;
System.out.println(isSameTree(root, root2));

	}

	private static boolean isSameTree(TreeNode root, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root==null && root2==null)
			return true;
		if(root==null || root2==null)
			return false;
		if(root.data!= root2.data)
			return false;
		
		return isSameTree(root.left, root2.left) && isSameTree(root.right, root2.right);
	}

}
