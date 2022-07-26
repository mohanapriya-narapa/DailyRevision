package CTCI_Chapter_one;

public class checkPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkPermutation("mona","onamm"));
	}

	private static boolean checkPermutation(String str1, String str2) {
		// TODO Auto-generated method stub
	int[] arr=new int[128];
	for(int i=0;i<str1.length();i++)
	{
		arr[str1.charAt(i)]++;
	}
	for(int i=0;i<str2.length();i++)
	{
		arr[str2.charAt(i)]--;
	}
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=0)
		{
			return false;
		}
	}return true;
	}

}
