package NeetCodeArrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(validAnagram("anagram", "nagaram"));
	}

	private static boolean validAnagram(String s, String t) {
		// TODO Auto-generated method stub
		int[] arr=new int[126];
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]++;
		}
		for(int i=0;i<t.length();i++)
		{
			arr[t.charAt(i)]--;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				return false;
			}
		}
		return true;
	}

}
