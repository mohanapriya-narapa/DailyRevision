package heap;

import java.util.PriorityQueue;

public class KthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {3,2,1,5,6,4};
		
System.out.println(kthLargest(nums,2));
	}

	private static int kthLargest(int[] nums, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> heap=new PriorityQueue<Integer>((n1,n2)->n1-n2);
	for(int n:nums)
	{
		heap.add(n);
		if(heap.size()>k)
		{
		heap.poll();
		}
	}
	return heap.poll();
	}

}
