package SeventyFiveProblems;

public class DeleteNode {
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
head.next=first;
first.next=second;
second.next=third;
deleteNode(second);
print(head);
	}
	private static void print(Node head) {
		// TODO Auto-generated method stub
		while(head!=null)
		{System.out.println(head.data);
			head=head.next;
		}
	}
	private static void deleteNode(Node first) {
		// TODO Auto-generated method stub
	Node next=first.next;
	first.next=next.next;
	first.data=next.data;
		}
	}


