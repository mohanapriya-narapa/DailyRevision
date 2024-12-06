package SeventyFiveProblems;
import java.util.*;
public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1,2,3, 1};
System.out.println(containsDuplicates(nums));
	}

	private static boolean containsDuplicates(int[] nums) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int x:nums)
		{
            if(!hs.add(x))
            		{
            	return true;
            	
            		}
		}return false;
	}

}
