package ctci_stacks;

import java.util.HashMap;
import java.util.Stack;

public class NextGreatestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums1=new int[] {4,1,2};
int[] nums2=new int[] {1,3,4,2};

int[] res=NextGreatestElement(nums1,nums2);
for(int x:res)
{
	System.out.println(x);
}
	}

	private static int[] NextGreatestElement(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		for(int i=0;i<nums2.length;i++)
		{
			while(!st.isEmpty() && nums2[i]>st.peek())
			{
				hs.put(st.pop(), nums2[i]);
			}st.push(nums2[i]);
		}
		while(!st.isEmpty())
		{
			hs.put(st.pop(), -1);
		}
		int[] res=new int[nums1.length]; 
		for(int i=0;i<nums1.length;i++)
		{
			res[i]=hs.get(nums1[i]);
		}
		return res;
	}

}
