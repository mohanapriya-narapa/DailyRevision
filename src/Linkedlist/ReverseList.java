package Linkedlist;

import CTCI_chapter_two.removeDuplicates.Node;

public class ReverseList {
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
		Node res=reverseList(head);
		printList(res);
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
	private static Node reverseList(Node head) {
		// TODO Auto-generated method stub
		Node prev=null;
		Node cur=head;
		while(cur!=null)
		{
			Node next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			
		}
		return prev;
	}

}
