package ctci_linkedlists_revision;

import ctci_linkedlists.FindMiddleNode.Node;

public class FindMiddleNode {
	public static class Node
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
		System.out.println(findMiddleNode(head));
		
	}
	private static int findMiddleNode(Node head) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.data;
	}

}
