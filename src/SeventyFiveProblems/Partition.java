package SeventyFiveProblems;

import ctci_linkedlists.deleteNode.Node;

public class Partition {
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
		Node first=new Node(4);
		Node second=new Node(3);
		Node third=new Node(2);
		Node fourth=new Node(5);
		Node fifth=new Node(2);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		Node result= partition(head, 3);
		print(result);
	}
	private static void print(Node result) {
		// TODO Auto-generated method stub
	while(result!=null)
	{
		System.out.println(result.data);
		result=result.next;
	}
	}
	private static Node partition(Node head, int x) {
		// TODO Auto-generated method stub
		if(head==null) return null;
		Node before =new Node(0);
		Node beforeHead=before;
		Node after=new Node(0);
		Node afterHead=after;
		while(head!=null)
		{
			Node next=head.next;
			if(head.data<x)
			{
				before.next=head;
				before=head;
			}
			else {
				after.next=head;
				after=head;
			}
			head=next;
		}
		after.next=null;
		before.next=afterHead.next;
		
		return beforeHead.next;
	}

}
