package Linkedlist;

import java.util.Stack;

public class PalindromeLinkedList {
	public static class Node
	{
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data=data;
		this.next=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node (1);
		Node first=new Node (2);
		Node second=new Node (2);
		Node third=new Node (1);
		head.next=first;
		first.next=second;
		second.next=third;
		System.out.println(isPalindrome(head));
	}
	private static boolean isPalindrome(Node head) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer> ();
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			st.push(slow.data);
			fast=fast.next.next;
			slow=slow.next;
		}
		if(fast!=null)
		{ slow=slow.next;
		}
		while(slow!=null)
		{
			int top=st.pop();
			if(top!=slow.data)
			{
				return false;
			}slow=slow.next;
		}
		
		return true;
	}

}
