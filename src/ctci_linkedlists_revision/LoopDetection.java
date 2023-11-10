package ctci_linkedlists_revision;

import ctci_linkedlists.loopDetection.ListNode;

public class LoopDetection {
public static class ListNode{
		
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		System.out.println(loopDetection(first));
		System.out.println(loopStartPoint(first));
	}
	private static int loopStartPoint(ListNode head) {
		// TODO Auto-generated method stub
		ListNode slow=head;
		ListNode fast=head;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			if(slow==fast)
				break;
			slow=slow.next;
			fast=fast.next.next;
		}
		slow=head;
		while(slow!=fast)
		{
			slow=slow.next;
			fast=fast.next;
		}
		return fast.data;
			
	}
	private static boolean loopDetection(ListNode head) {
		// TODO Auto-generated method stub
		ListNode slow=head;
		ListNode fast=head;
		while(slow!=null && fast!=null && fast.next!=null)
		{
			if(slow==fast)
				return true;
			slow=slow.next;
			fast=fast.next.next;
		}
			
		return false;
	}

}
