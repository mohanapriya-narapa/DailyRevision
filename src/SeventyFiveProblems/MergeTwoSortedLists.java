package SeventyFiveProblems;
import java.util.*;
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int [] {1,2,3	};
int[] nums=new int[] {4,5,6};
List<Integer> list1=new LinkedList<>();
for(int x:arr)
{
	list1.add(x);
}
List<Integer> list2=new LinkedList<>();
for(int x:nums)
{
	list2.add(x);
}
System.out.println(mergeSortedLists(list1, list2, 5));
		}

	private static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2, int k) {
		// TODO Auto-generated method stub
		int i=0, j=0;
		List<Integer> mergedList=new LinkedList<>();
		while(mergedList.size()<k && i<list1.size() && j<list2.size())
		{
			if(list1.get(i)<list2.get(j))
			{
				mergedList.add(list1.get(i));
				i++;
			}
			else
			{
					mergedList.add(list2.get(j));
					j++;
				}
			
		}
		while(mergedList.size()<k && i<list1.size())
		{
			mergedList.add(list1.get(i));
			i++;
		}
		while(mergedList.size()<k && j<list2.size())
		{
			mergedList.add(list2.get(j));
			j++;
		}
		return mergedList;
	}
}


