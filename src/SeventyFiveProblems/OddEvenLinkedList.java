package SeventyFiveProblems;

import ctci_linkedlists.deleteNode.Node;

public class OddEvenLinkedList {
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
		Node head=new Node(1);
		Node first=new Node(2);
		Node second=new Node(3);
		Node third=new Node(4);
		Node fourth=new Node(5);
		Node fifth=new Node(6);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		oddEvenList(head);
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
	private static void oddEvenList(Node head) {
		// TODO Auto-generated method stub
		Node odd=head;
		Node even=head.next;
		Node evenHead=even;
		while(even!=null && even.next!=null)
		{
			odd.next=even.next;
			odd=odd.next;
			even.next=odd.next;
			even=even.next;
		}
		odd.next=evenHead;
		
	}

}
