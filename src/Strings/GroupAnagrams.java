package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] strs=new String[] {"eat","tea","tan","ate","nat","bat"};
HashMap<String,  ArrayList<String>> hs=new HashMap<String, ArrayList<String>>();
for(String s:strs)
{
	char[] ch=s.toCharArray();
	Arrays.sort(ch);
	String str1=new String(ch);
	if(!hs.containsKey(str1))
	{
		hs.put(str1, new ArrayList<>());
	}
	hs.get(str1).add(s);
}
System.out.println(hs);
	}

}
