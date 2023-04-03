package Linkedlist;

import Linkedlist.DeleteNode.Node;

public class SlowPointerFastPointer {
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
		Node head=new Node(0);
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		System.out.println(middleNode(head));
		
	}
	private static int middleNode(Node head) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}

}
