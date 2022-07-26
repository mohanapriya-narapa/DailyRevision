package CTCI_Chapter_one;
import java.util.*;
public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(IsomorphicStrings("egg","add"));
	}

	private static boolean IsomorphicStrings(String str1, String str2) {
		// TODO Auto-generated method stub
		HashMap<Character,Character> hs=new HashMap<Character,Character>();
		if(str1.length()!=str2.length())
		{
			return false;
		}
		for(int i=0;i<str1.length();i++)
		{
			char c1=str1.charAt(i);
			char c2=str2.charAt(i);
			if(hs.containsKey(c1))
			{
				if(hs.get(c1)!=c2)
				{
					return false;
				}
				
			}
			else
			{
				if(hs.containsValue(c2))
				{
					return false;
				}
				hs.put(c1,c2);
			}
		}
		return true;
	}

}
