package ctci_one;

public class oneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(oneAway("pale","bale"));
	}

	private static boolean oneAway(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length()==str2.length())
		{
			return replacement(str1,str2);
		}
		else if(str1.length()<str2.length())
		{
			return insertion(str1,str2);
		}
		else
		{
			return insertion(str2,str1);
		}
	}

	private static boolean insertion(String str1, String str2) {
		// TODO Auto-generated method stub
		int index1=0,index2=0;
		while(index1<str1.length() && index2<str2.length())
		{
			if(str1.charAt(index1)!=str2.charAt(index2))
			{if(index1!=index2)
			{
				return false;
			}
				index2++;
			}
			else
			{
				index1++;
				index2++;
			}
		}return true;
	}

	private static boolean replacement(String str1, String str2) {
		// TODO Auto-generated method stub
		int count=0;
for(int i=0;i<str1.length();i++)
{
	if(str1.charAt(i)!=str2.charAt(i))
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
