package SeventyFiveProblems;

public class BesyBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {7,1,5,3,6,4};
int min=nums[0];
int maxProfit=0;
for(int i=1;i<nums.length;i++)
{int profit=nums[i]-min;
	maxProfit=Math.max(maxProfit,profit);
	min=Math.min(min, nums[i]);
	
}
System.out.println(maxProfit);
	}

}
