package Strings;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(wordPattern("abba", "dog cat cat dog"));
	}

	private static boolean wordPattern(String pattern, String s) {
		// TODO Auto-generated method stub
		char[] charArray= pattern.toCharArray();
	     String[] str=s.split(" ");
	     if(str.length!=charArray.length)
	     {
	         return false;
	     }
	     HashMap<String, Character> hs=new HashMap<>();
	for(int i=0;i<str.length;i++)
	{
	    if(hs.containsKey(str[i]))
	    {
	        if(!hs.get(str[i]).equals(charArray[i]))
	        {
	return false;
	        }
	    }
	    else
	    {
	        if(hs.containsValue(charArray[i]))
	        {
	            return false;
	        }
	        hs.put(str[i], charArray[i]);
	    }
	    }
	    return true;
	}

}
