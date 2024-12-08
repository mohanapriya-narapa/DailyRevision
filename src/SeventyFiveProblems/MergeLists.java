package SeventyFiveProblems;

import ctci_linkedlists.deleteNode.Node;

public class MergeLists {
public static class Node
{
	public int data;
	public Node next;
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
		third.next=fourth;
		fourth.next=fifth;
		Node result=mergeLists(head, third);
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
	private static Node mergeLists(Node l1, Node l2) {
		// TODO Auto-generated method stub
		if(l1==null && l2==null)return null;
		Node dummy=new Node(0);
		Node current=dummy;
		while(l1!=null || l2!=null)
		{
			if(l1==null || (l2!=null && l2.data<l1.data))
			{
				current.next=l2;
l2=l2.next;
				current=current.next;
			}
			else {
				current.next=l1;
				l1=l1.next;
				current=current.next;
			}
		}return dummy.next;
		
	}

}
