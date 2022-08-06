package CTCI_chapter_two;

import java.util.HashSet;

public class removeDuplicates {
	public static class Node
	{
		private int data;
		private Node next;
		public Node(int data)
		{this.data=data;
		this.next=null;		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		Node first=new Node(11);
		Node second=new Node(12);
		Node three=new Node(13);
		Node four=new Node(10);
		head.next=first;
		first.next=second;
		second.next=three;
		three.next=four;
		duplicates(head);
		printList(head);
	}

	private static void printList(Node head) {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static Node duplicates(Node head) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		Node previous=null;
while(head!=null)
{if(!hs.contains(head.data))
{
previous=head;
hs.add(head.data);
}
else
{
	previous.next=head.next;
}
	head=head.next;
}return head;
		
	}

}
