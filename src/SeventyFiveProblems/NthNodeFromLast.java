package SeventyFiveProblems;

import SeventyFiveProblems.DeleteNode.Node;

public class NthNodeFromLast {
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
		Node head=new Node(2);
		Node first=new Node(3);
		Node second=new Node(4);
		Node third=new Node(5);
		Node fourth=new Node(6);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		System.out.println(nthNodeFromLast(head, 4));
	}
	private static int nthNodeFromLast(Node head, int n) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		int count=0;
		while(count<n)
		{
			fast=fast.next;
			count++;
		}
		while(fast!=null)
		{
			fast=fast.next;
			slow=slow.next;
		}
		return slow.data;
	}

}
