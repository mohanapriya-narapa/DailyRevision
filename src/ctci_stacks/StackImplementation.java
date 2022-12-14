package ctci_stacks;

public class StackImplementation {
	public static int[] arr=new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1};
	public static int[] head=new int[] {-1,-1,-1};
	public static int stacknum=3; public static int stackSize=3; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(5,0);push(6,0);push(8,1);
		System.out.println(peek(1));System.out.println(pop(1));System.out.println(empty(1));

	}
	private static int pop(int stacknum) {
		// TODO Auto-generated method stub
		if(head[stacknum]==-1)
		{
			return -1;
		}int offset=arrayOffset(stacknum)+ head[stacknum];
		head[stacknum]--;		
		return arr[offset];
	}
	private static boolean empty(int stacknum) {
		// TODO Auto-generated method stub
		if(head[stacknum]==-1)
		{
			return true;
		}return false;
	}
	private static int peek(int stacknum) {
		// TODO Auto-generated method stub
		if(head[stacknum]==-1)
		{
			return -1;
		}
		
		int offset=arrayOffset(stacknum)+ head[stacknum];
		return arr[offset];
	}
	private static void push(int i, int stacknum) {
		// TODO Auto-generated method stub
		head[stacknum]++;
		int offset=arrayOffset(stacknum)+ head[stacknum];
		 arr[offset]=i;
		
	}
	private static int arrayOffset(int stacknum) {
		// TODO Auto-generated method stub
		return stacknum*stackSize;
	}

}
