package ctci_linkedlists;

public class Intersection {
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
		Node firstOne=new Node(9);
		firstOne.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		 System.out.println(getNode(first,firstOne ));
	}
	private static int getNode(Node first, Node firstOne) {
		// TODO Auto-generated method stub
		int c1=getCount(first);
		int c2=getCount(firstOne);
		if(c1>c2)
		{
			return getIntersectionNode(c1-c2, first, firstOne);
		}
		else
		{
			return getIntersectionNode(c2-c1, firstOne, first);
		}
	}
	private static int getCount(Node first) {
		// TODO Auto-generated method stub
int count=0;
while(first!=null)
{
	count++;
	first=first.next;
}return count;
	}
	
	private static int getIntersectionNode(int d, Node first, Node firstOne) {
		// TODO Auto-generated method stub
		Node current1=first;
		Node current2=firstOne;
for(int i=0;i<d;i++)
{
	current1=current1.next;
}
while(current1!=null && current2!=null)
{
	if(current1==current2)
	{
		return current1.data;
	}
	current1=current1.next;
	current2=current2.next;
}
return -1;
	}

}

