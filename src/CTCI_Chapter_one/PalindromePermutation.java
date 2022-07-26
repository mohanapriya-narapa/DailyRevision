package CTCI_Chapter_one;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(PalindromePermuatation("taco coa"));
	}

	private static boolean PalindromePermuatation(String str) {
		// TODO Auto-generated method stub
		int[] arr=new int[128];
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=32)
			{
				arr[str.charAt(i)]++;
			}
		}
			for(int i1=0;i1<arr.length;i1++)
			{
				if(arr[i1]>0 && arr[i1]%2 !=0)
				{
					count++;
				}
			}
		
		
		if(count>1)
		{
			return false;
		}
		return true;
	}

}
