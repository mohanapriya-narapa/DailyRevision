package TreesPractice;

public class SumRootToLeaf {
	public static int rootToLeaf;
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
		rootToLeaf=0;
		sumRootToLeaf(left,0);	
		System.out.println(rootToLeaf);
	}
	private static void sumRootToLeaf(TreeNode root, int cur) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
	    if(root!=null)
	    	cur=cur*10+root.data;
	    if(root.left==null && root.right==null)
	    	rootToLeaf+=cur;
	    sumRootToLeaf(root.left,cur);
	    sumRootToLeaf(root.right,cur);
	}

}
