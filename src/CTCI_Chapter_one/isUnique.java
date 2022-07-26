package CTCI_Chapter_one;

public class isUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isUnique("mona"));
	}

	private static boolean isUnique(String string) {
		// TODO Auto-generated method stub
		boolean[] arr=new boolean[128];
		
		for(int i=0;i<string.length();i++)
		{
			if(arr[string.charAt(i)])
			{
			return false;
			}
		
			arr[string.charAt(i)]=true;
		}
		return true;
	}

}
