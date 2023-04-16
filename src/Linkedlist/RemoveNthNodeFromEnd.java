package Linkedlist;

import ctci_linkedlists.nthNodeFromLast.Node;

public class RemoveNthNodeFromEnd {
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
		Node second=new Node (3);
		Node third=new Node (4);
		Node fourth=new Node (5);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		RemoveNthNodeFromEnd(head,4);
		print(head);
	}
	private static void print(Node head) {
		// TODO Auto-generated method stub
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	private static void RemoveNthNodeFromEnd(Node head, int n) {
		// TODO Auto-generated method stub
		Node resultNode=nthNodeFromLast(head, n);
		Node next=resultNode.next;
		resultNode.data=next.data;
		resultNode.next=next.next;
	}
	private static Node nthNodeFromLast(Node head, int n) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		int count=0;
		while(count<n)
		{
			count++;
			fast=fast.next;
		}
		while(fast!=null)
		{
			fast=fast.next;
			slow=slow.next;
		}
		return slow;
	}

}
