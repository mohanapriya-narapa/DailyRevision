package Revision_Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkPermutation("dog","gmd"));
	}

	private static boolean checkPermutation(String str1, String str2) {
		// TODO Auto-generated method stub
		int[] arr=new int[128];
		for(int i=0;i<str1.length();i++)
		{
			arr[str1.charAt(i)]++;
		}
		for(int j=0;j<str2.length();j++)
		{
			arr[str2.charAt(j)]--;
		}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
					return false;
			}
			
		return true;
	}

}
