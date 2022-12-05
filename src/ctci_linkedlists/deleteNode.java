package ctci_linkedlists;

public class deleteNode {
public static class Node
{
	private int data;
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
second.next=third;
third.next=fourth;
fourth.next=fifth;
deleteNode(head);
	}
	private static void deleteNode(Node head) {
		// TODO Auto-generated method stub
		
	}

}
