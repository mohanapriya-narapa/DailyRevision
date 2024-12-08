package SeventyFiveProblems;
import java.util.*;
import SeventyFiveProblems.NthNodeFromLast.Node;

public class RemoveDuplicates {
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
		Node third=new Node(4);
		Node fourth=new Node(4);
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
		{System.out.println(head.data);
			head=head.next;
		}
	}
	private static void removeDuplicates(Node head) {
		// TODO Auto-generated method stub
		Node previous=null;
		HashSet<Integer> hs=new HashSet<Integer>();
		while(head!=null)
		{
			if(hs.contains(head.data))
			{
				previous.next=head.next;
			}
			else {
				hs.add(head.data);
				previous=head;
			}
			head=head.next;
		}
	}

}
