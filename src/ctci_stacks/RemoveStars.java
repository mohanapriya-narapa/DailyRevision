package ctci_stacks;

import java.util.Stack;

public class RemoveStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(removeStars("leet**cod*e"));
	}

	private static String removeStars(String s) {
		// TODO Auto-generated method stub
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
sb.append(st.pop());
        }
        return sb.reverse().toString();
	}

}
