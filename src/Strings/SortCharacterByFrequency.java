package Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SortCharacterByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="cccaaa";
System.out.println(frequencySort(str));
	}

	private static String frequencySort(String str) {
		// TODO Auto-generated method stub
HashMap<Character,Integer> hs=new HashMap<>();
char[] charArray=str.toCharArray();
for(int i=0;i<charArray.length;i++)
{
	hs.put(charArray[i], hs.getOrDefault(charArray[i],0)+1);
}
List<Character> li=new LinkedList<>(hs.keySet());
Collections.sort(li, (a,b)-> hs.get(b)-hs.get(a));
StringBuilder sb=new StringBuilder();
for(char c:li)
{
int copies=hs.get(c);
for(int i=0;i<copies;i++)
{
	sb.append(c);
}
}
return sb.toString();
	
	}

}
