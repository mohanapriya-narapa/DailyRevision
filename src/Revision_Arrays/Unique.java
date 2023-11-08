package Revision_Arrays;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(unique("mango"));
	}

	private static boolean unique(String str) {
		// TODO Auto-generated method stub
		boolean[] arr=new boolean[128];
		for(int i=0;i<str.length();i++)
		{
			if(arr[str.charAt(i)])
			return false;
			arr[str.charAt(i)]=true;
		}
		return true;
	}

}
