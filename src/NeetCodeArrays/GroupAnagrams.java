package NeetCodeArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, LinkedList> hs=new HashMap<String, LinkedList>();
String[] strs=new String[] {"eat","tea","tan","ate","nat","bat"};
for(int i=0;i<strs.length;i++)
{
	char[] ch=strs[i].toCharArray();
	Arrays.sort(ch);
	String key=new String(ch);
	if(!hs.containsKey(key))
	{
		hs.put(key, new LinkedList<>());
	}
	hs.get(key).add(strs[i]);
	
}
System.out.println(hs);

	}

}
