package Linkedlist;

import Linkedlist.PalindromeLinkedList.Node;

public class SwapNodes {
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
		print(SwapNodes(head,2));
	}
	private static void print(Node head) {
		// TODO Auto-generated method stub
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	private static Node SwapNodes(Node head, int k) {
		// TODO Auto-generated method stub
		int count=0;
		Node current=head;
		  while(current!=null)
	        {
	            count++;
	            current=current.next;
	        }
		  Node frontNode=head;
	        Node endNode=head;
	        for(int i=1;i<k;i++)
	        {
	            frontNode =frontNode.next;
	        }
	        for(int i=1;i<=count-k;i++)
	        {
	endNode=endNode.next;
	        }
	    int temp=    frontNode.data;
	    frontNode.data=endNode.data;
	    endNode.data=temp;
		return head;
	}

}
 