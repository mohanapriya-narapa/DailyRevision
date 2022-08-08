package CTCI_chapter_two;

import java.util.Stack;

public class Palindrome {
	private static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first=new Node(0);
		Node second=new Node(1);
		Node third=new Node(2);
		Node fourth=new Node(1);
		Node fifth=new Node(0);
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		boolean result=palindrome(first);
		System.out.println(result);
		
	}
	private static boolean palindrome(Node first) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		Node slow=first;
		Node fast=first;
		while(fast!=null && fast.next!=null)
		{
			st.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null)
		{
			slow=slow.next;
		}
		while(slow!=null)
		{
			int top=st.pop();
			if(top!=slow.data)
			{
				return false;
			}
			slow=slow.next;
		}
		return true;
	}

}
