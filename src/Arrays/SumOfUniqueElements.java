package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {1,2,3,2};int sum=0;
HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
for(int i=0;i<nums.length;i++)
{
	hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
}
for(Map.Entry<Integer,Integer> map: hs.entrySet())
{
	if(map.getValue()==1)
	{
		sum+=map.getKey();
	}
}System.out.println(sum);
	}

}
