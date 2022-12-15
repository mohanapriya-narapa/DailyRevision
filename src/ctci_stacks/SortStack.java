package ctci_stacks;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> st1=new Stack<Integer>();
st1.push(2);
st1.push(8);
st1.push(1);
st1.push(10);
st1.push(5);
st1.push(9);
sort(st1);
System.out.println(st1);
	}

	private static void sort(Stack<Integer> st1) {
		// TODO Auto-generated method stub
		Stack<Integer> st2=new Stack<Integer>();
		while(!st1.isEmpty())
		{
			int top=st1.peek();
				st1.pop();
			while(!st2.isEmpty() && top<st2.peek())
			{
				st1.push(st2.pop());
			}
			st2.push(top);
		}
		while(!st2.isEmpty())
		{
			st1.push(st2.pop());
		}
	}

}
