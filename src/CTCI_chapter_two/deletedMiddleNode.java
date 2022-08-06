package CTCI_chapter_two;

import CTCI_chapter_two.removeDuplicates.Node;

public class deletedMiddleNode {
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
		head.next=first;
		first.next=second;
		second.next=three;
		deleteNode(second);
		printList(head);
	}
	private static void deleteNode(Node head) {
		// TODO Auto-generated method stub
	Node next=head.next;
	head.data=next.data;
	head.next=next.next;
	}
	private static void printList(Node head) {
		// TODO Auto-generated method stub
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}

}
