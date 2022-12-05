package ctci_linkedlists;

import java.util.HashSet;

public class remove_duplicates {
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
Node head=new Node (10);
Node first=new Node (11);
Node second=new Node (12);
Node third=new Node (13);
Node fourth=new Node (13);
head.next=first;
first.next=second;
second.next=third;
third.next=fourth;
removeDuplicates(head);
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
	private static void removeDuplicates(Node head) {
		Node previous=null;
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<Integer>();
		while(head!=null)
		{
			if(set.contains(head.data))
			{
				previous.next=head.next;
			}
			else
			{
				set.add(head.data);
				previous=head;
			}
			head=head.next;
		}
	}

}
