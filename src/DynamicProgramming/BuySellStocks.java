package DynamicProgramming;

public class BuySellStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] prices=new int[] {7,1,5,3,6,4};
System.out.println(maxProfit(prices));
	}

	private static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub
		int maxProfit=0;
		int min=prices[0];
		for(int i=0;i<prices.length;i++)
		{
			int profit=prices[i]-min;
			maxProfit=Math.max(profit,maxProfit);
			min=Math.min(min,prices[i]);
			
		}
		return maxProfit;
	}

}
