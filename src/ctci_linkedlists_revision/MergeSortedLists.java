package ctci_linkedlists_revision;

import ctci_linkedlists.MergedSortedLists.Node;

public class MergeSortedLists {
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
		// TODO Auto-generated method stub
				Node head=new Node(1);
				Node first=new Node(2);
				Node second=new Node(4);
				Node third=new Node(1);
				Node fourth=new Node(3);
				Node fifth=new Node(4);
				head.next=first;
				first.next=second;
				third.next=fourth;
				fourth.next=fifth;
				Node mergedNode =MergeLists(head,third);
				print(mergedNode);
	}
	private static void print(Node head) {
		// TODO Auto-generated method stub
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	private static Node MergeLists(Node l1, Node l2) {
		// TODO Auto-generated method stub
		Node dummy= new Node(0);
		Node current=dummy;
		while(l1!=null || l2!=null)
		{
			if(l1==null || (l2!=null && l2.data<l1.data))
			{
				current.next=l2;
				l2=l2.next;
				current=current.next;
			}
			else
			{
				current.next=l1;
				l1=l1.next;
				current=current.next;
			}
		}
		return dummy.next;
	}

}
