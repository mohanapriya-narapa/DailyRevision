package Arrays;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {2,7,11,15};
int target=9;
HashMap<Integer, Integer> hs=new HashMap<Integer,Integer>();
int[] res=new int[2];
for(int i=0;i<arr.length;i++)
{
	if(hs.containsKey(arr[i]))
	{
		res[0]=hs.get(arr[i]);
		res[1]=i;
	}
	else
	{
		hs.put(target-arr[i], i);
	}
}
for(int x:res)
{
	System.out.println(x);
}
	}

}
