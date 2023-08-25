package Strings;

import java.util.Stack;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="A man, a plan, a canal: Panama";
char[] charset=str.toLowerCase().toCharArray();
Stack<Character> st=new Stack<Character>();
for(char c: charset)
{
	if(isAlphaNumeric(c))
	{
		st.push(c);
	}
}
for(char c: charset)
{
	if(isAlphaNumeric(c) && st.pop()!=c)
	{
		System.out.println("is not palindrome");
		break;
	}
}
System.out.println("is palindrome");
	}

	private static boolean isAlphaNumeric(char c) {
		// TODO Auto-generated method stub
		if((c>='0' && c<='9') || (c>='a' && c<='z') )
		{
			return true;
		}
		return false;
	}

}
