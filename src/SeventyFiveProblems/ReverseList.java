package SeventyFiveProblems;

import SeventyFiveProblems.FindMiddleNode.Node;

public class ReverseList {
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
		Node head=new Node(0);
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(4);

		head.next=first;
		first.next=second;
		second.next=third;
	Node result=	reverseList(head);
		print(result);
	}
	private static void print(Node head) {
		// TODO Auto-generated method stub
		while(head!=null)
		{
System.out.println(head.data);
head=head.next;
		}
	}
	private static Node reverseList(Node head) {
		// TODO Auto-generated method stub
		Node prev=null;
		Node cur=head;
		while(cur!=null)
		{
			Node next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
	}

}
