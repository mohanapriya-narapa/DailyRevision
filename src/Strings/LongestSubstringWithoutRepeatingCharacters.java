package Strings;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcabcbb";
System.out.println(lengthOfLongestSubstring(str));
	}

	private static int lengthOfLongestSubstring(String str) {
		// TODO Auto-generated method stub
	HashMap<Character,Integer> map=new HashMap<>();
	int n=str.length();int ans=0;
	for(int i=0, j=0;j<str.length();j++)
	{
		if(map.containsKey(str.charAt(j)))
		{
			i=Math.max(map.get(str.charAt(j))+1, i);
		}
		ans=Math.max(ans, j-i+1);
		map.put(str.charAt(j),j);
	}
	return ans;
	}

}
