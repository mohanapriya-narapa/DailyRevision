package Linkedlist;

import ctci_linkedlists.deleteNode.Node;

public class DeleteNode {
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
		deleteNode(fourth);
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
	private static void deleteNode(Node n) {
		// TODO Auto-generated method stub
		Node next=n.next;
		n.data=next.data;
		n.next=next.next;
		
	}

}
