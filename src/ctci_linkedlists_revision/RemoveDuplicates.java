package ctci_linkedlists_revision;

import java.util.HashSet;

import ctci_linkedlists.remove_duplicates.Node;

public class RemoveDuplicates {
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
		Node head=new Node (10);
		Node first=new Node (11);
		Node second=new Node (12);
		Node third=new Node (13);
		Node fourth=new Node (13);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		removeDuplicates(head);
		print(head);
	}

	private static void print(Node head) {
		// TODO Auto-generated method stub
		
	}

	private static void removeDuplicates(Node head) {
		// TODO Auto-generated method stub
	HashSet<Integer> hs=new HashSet<Integer>();	
	Node previous=null;
	while(head!=null)
	{
		if(!hs.contains(head.data))
		{
			previous=head;
			hs.add(head.data);
		}
		else
		{
			previous.next=head.next;
		}head=head.next;
	}
	}

}
