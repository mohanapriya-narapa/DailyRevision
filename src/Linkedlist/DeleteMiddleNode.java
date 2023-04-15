package Linkedlist;

import ctci_linkedlists.FindMiddleNode.Node;

public class DeleteMiddleNode {
	public static class ListNode
	{
		int data;
		ListNode next;
		ListNode(int data)
		{
			this.data=data;
			this.next=next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(0);
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		ListNode fifth=new ListNode(5);
		head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		deleteMiddleNode(head);
		print(head);
	}
	private static void print( ListNode head) {
		// TODO Auto-generated method stub
 while(head!=null)
 {
	 System.out.println(head.data);
	 head=head.next;
 }
	}
	private static void deleteMiddleNode(ListNode head) {
		// TODO Auto-generated method stub
		ListNode middleNode = findMiddleNode(head);
		ListNode next=middleNode.next;
		middleNode.data=next.data;
		middleNode.next=next.next;							
	}
	private static ListNode findMiddleNode(ListNode head) {
		// TODO Auto-generated method stub

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
           slow=slow.next;
           fast=fast.next.next;

        }
        System.out.println(slow.data);
        return slow;							
	}

}
