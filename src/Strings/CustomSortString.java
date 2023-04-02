package Strings;

import java.util.HashMap;

public class CustomSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(CustomSortString("cba", "abcd"));
	}

	private static String CustomSortString(String s, String t) {
		// TODO Auto-generated method stub
        HashMap<Character,Integer> hs= new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            hs.put(t.charAt(i), hs.getOrDefault(t.charAt(i),0)+1);
        }
        StringBuilder sb=new StringBuilder();
for(char c:s.toCharArray())
{
    if(hs.containsKey(c))
    {
        int count=hs.remove(c);
        for(int i=0;i<count;i++)
        {
            sb.append(c);
        }
    }
}
for(char c:hs.keySet())
{
    if(hs.containsKey(c))
    {
        int count=hs.get(c);
        for(int i=0;i<count;i++)
        {
            sb.append(c);
        }
    }
}
return sb.toString();
	}

}
