package ctci_chapter8;

public class TripleStep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countways (10));

	}

	private static int countways(int n) {
		// TODO Auto-generated method stub
		if(n<0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return countways(n-1)+countways(n-2)+countways(n-3);
		}
	}

	

}
