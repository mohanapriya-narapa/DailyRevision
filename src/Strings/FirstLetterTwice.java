package Strings;

import java.util.HashSet;

public class FirstLetterTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcdeda";
HashSet<Character> hs=new HashSet<Character>();
for(int i=0;i<str.length();i++)
{
	if(hs.contains(str.charAt(i)))
	{
	System.out.println(str.charAt(i));	
	break;
	}
	else
	{
		hs.add(str.charAt(i));
	}
}

	}

}
