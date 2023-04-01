package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LuckyNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
int[] arr=new int[] {2,2,3,4};

for(int i=0;i<arr.length;i++)
{
    hs.put(arr[i], hs.getOrDefault(arr[i],0)+1);
}
System.out.println(hs);
int max=0;
for(Map.Entry<Integer,Integer> map: hs.entrySet())
{
    if(map.getValue().equals(map.getKey()))
    {
max=Math.max(max, map.getKey());
    }
}
System.out.println(max);
	}

}
