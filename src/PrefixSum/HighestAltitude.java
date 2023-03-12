package PrefixSum;

public class HighestAltitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {-5,1,5,0,-7};
System.out.println(largestAltitude(nums));
	}

	private static int largestAltitude(int[] gain) {
		// TODO Auto-generated method stub
		int[] res=new int[gain.length+1];
		res[0]=0;int max=-99999;
		for(int i=0;i<gain.length;i++)
		{
			res[i+1]=gain[i]+res[i];
		}
		for(int i=0;i<res.length;i++)
		{
			max=Math.max(max,res[i]);
		}
		return max;
	}

}
