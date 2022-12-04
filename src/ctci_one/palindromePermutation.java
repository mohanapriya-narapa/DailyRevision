package ctci_one;

public class palindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(palindromePermutation("taco cat"));
	}

	private static boolean palindromePermutation(String str) {
		// TODO Auto-generated method stub
int[] arr=new int[128];
int count=0;
for(int i=0;i<str.length();i++)
{if(str.charAt(i)!=32)
	arr[str.charAt(i)]++;
}
for(int i=0;i<arr.length;i++)
{
	if(arr[i]>0 && (arr[i]%2!=0))
	{
		count++;
	}
}
if(count>1)
{
	return false;
}return true;
	}

}
