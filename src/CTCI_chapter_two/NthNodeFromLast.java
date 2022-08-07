package CTCI_chapter_two;

public class NthNodeFromLast {
	private static class Node
	{
		private int data;
		private Node next;
		Node(int data)
		{
			this.data=data;
			this.next=next;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first=new Node(10);
		Node second=new Node(11);
		Node third=new Node(12);
		Node fourth=new Node(13);
		Node fifth=new Node(14);
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		System.out.println(nthNodeFromLast(first,2));
	}
	private static int nthNodeFromLast(Node head, int n) {
		// TODO Auto-generated method stub
int count=0;
Node fast=head;
Node slow=head;
while(count<n)
{
	count++;
	fast=fast.next;
}
while(fast!=null)
{
	fast=fast.next;
	slow=slow.next;
}return slow.data;
	}

}
