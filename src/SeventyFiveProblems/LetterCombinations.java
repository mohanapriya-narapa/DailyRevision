package SeventyFiveProblems;
import java.util.*;
public class LetterCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String digits="23";
HashMap<Character, String> hs=new HashMap<>();
hs.put('2', "abc");
hs.put('3', "def");
hs.put('4', "ghi");
hs.put('5', "jkl");
hs.put('6', "mno");
StringBuilder sb=new StringBuilder();
List<String> cur=new LinkedList<>();
letterCombinations(hs, cur, sb,  digits, 0);
System.out.println(cur);
	}

	private static void letterCombinations(HashMap<Character, String> hs, List<String> cur, StringBuilder sb,
			String digits, int start) {
		// TODO Auto-generated method stub
		if(sb.length()==digits.length())
		{
			cur.add(sb.toString());
			return;
		}
		String letters=hs.get(digits.charAt(start));
		for(int i=0;i<letters.length();i++)
		{
			sb.append(letters.charAt(i));
			letterCombinations(hs, cur, sb, digits, start+1);
			sb.deleteCharAt(sb.length()-1);
		}
	}

}
