package Strings;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="egg";
String t="add";
System.out.println(ismorpgicStrings(s,t));
	}

	private static boolean ismorpgicStrings(String s, String t) {
		// TODO Auto-generated method stub
if(s==null || t==null)
	return false;
if(s.length()!=t.length())
{
	return false;
}
HashMap<Character, Character> hs=new HashMap<Character, Character>();
for(int i=0;i<s.length();i++)
{
	char c1=s.charAt(i);
	char c2=t.charAt(i);
	if(hs.containsKey(c1))
	{
		if(hs.get(c1)!=c2)
		{
			return false;
		}
	}
	else
	{
		if(hs.containsKey(c2))
		{
			return false;
		}
		hs.put(c1,c2);
	}
	
}
return true;
	}

}
