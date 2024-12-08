package SeventyFiveProblems;
import java.util.*;
import SeventyFiveProblems.RemoveDuplicates.Node;

public class Palindrome {
public static class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(2);
		Node first=new Node(3);
		Node second=new Node(4);
		Node third=new Node(3);
		Node fourth=new Node(3);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		System.out.println(isPalindrome(head));
	}
	private static boolean isPalindrome(Node head) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			st.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null)
			slow=slow.next;
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
