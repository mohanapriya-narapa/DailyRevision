package Strings;

import java.util.*;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] strs=new String[] {"eat","tea","tan","ate","nat","bat"};
HashMap<String, List> hs=new HashMap<>();
for(String str:strs)
{
	char[] c=str.toCharArray();
	Arrays.sort(c);
	String key=new String(c);
	if(!hs.keySet().contains(key))
	{
		hs.put(key,new ArrayList<>());
	}
System.out.println(hs);
	hs.get(key).add(str);
}
System.out.println(hs.values());
	}

}
