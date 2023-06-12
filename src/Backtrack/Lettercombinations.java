package Backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lettercombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> cur = new ArrayList<>();
HashMap<Character, String> hs=new HashMap<Character, String>();
hs.put('2', "abc");
hs.put('3', "def");
hs.put('4', "ghi");
hs.put('5', "jkl");
hs.put('6', "mno");
StringBuilder sb=new StringBuilder();

LetterCombinations(hs, "23", cur, sb, 0);
System.out.println(cur);

}
public static void LetterCombinations ( HashMap<Character, String> hs, String digits, List<String> cur,StringBuilder sb, int i) 
		{
	if(sb.length()==digits.length())
	{
		cur.add(sb.toString());
		return;
	}
	System.out.println(cur);
	String letters= hs.get(digits.charAt(i));

	for(char letter:letters.toCharArray())
	{
		sb.append(letter);
		LetterCombinations(hs, digits, cur, sb, i+1);
		sb.deleteCharAt(sb.length()-1);
		
	}
		}
}
