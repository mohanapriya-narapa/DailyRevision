package ctci_linkedlists;

public class PartitionLists {
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
	Node first=new Node(10);
	Node second=new Node(12);
	Node third=new Node(3);
	Node fourth=new Node(5);
	Node fifth=new Node(2);
	Node sixth=new Node(9);
	first.next=second;
	second.next=third;
	third.next=fourth;
	fourth.next=fifth;
	fifth.next=sixth;


	Node result =partitionList(first,5);
	print(result);
		}
		private static void print(Node first) {
			// TODO Auto-generated method stub
			while(first!=null)
			{
				System.out.println(first.data);
				first=first.next;
			}
		}
		private static Node partitionList(Node n,int x ) {
			// TODO Auto-generated method stub
			Node head=n;
			Node tail=n;
			while(n!=null)
			{Node next=n.next;
				if(n.data<x)
				{
					n.next=head;
					head=n;
					
				}
				else
				{
					tail.next=n;
					tail=n;
				}
				n=next;
			}
			return head;
		}

}
