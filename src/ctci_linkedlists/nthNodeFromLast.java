package ctci_linkedlists;

import ctci_linkedlists.remove_duplicates.Node;

public class nthNodeFromLast {
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
		System.out.println(nthNodeFromLast(head,4));
		
	}
	private static int nthNodeFromLast(Node head, int n) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		int count=0;
		while(count<n)
		{count++;
			fast=fast.next;
		}
		while(fast!=null)
		{
			slow=slow.next;
			fast=fast.next;
		}
		return slow.data;
	}

}
