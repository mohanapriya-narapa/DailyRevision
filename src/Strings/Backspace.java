package Strings;

import java.util.Stack;

public class Backspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(equalStrings("ab#c", "ad#c"));
	}

	private static boolean equalStrings(String str1, String str2) {
		// TODO Auto-generated method stub
		Stack<Character> st1=new Stack<Character>();
		Stack<Character> st2=new Stack<Character>();
		for(int i=0;i<str1.length();i++)
		{if(str1.charAt(i) !='#')
			st1.push(str1.charAt(i));
		else
		{
			st1.pop();
		}
			
		}
		for(int i=0;i<str2.length();i++)
		{if(str2.charAt(i) !='#')
			st2.push(str2.charAt(i));
		else
		{
			st2.pop();
		}
			
		}
		for(int i=0;i<st1.size();i++)
		{
			if(st1.pop()!=st2.pop())
			{
				return false;
			}
		}
		return true;
	}

}
