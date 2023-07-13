package DynamicProgramming;

public class KnapsackRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] wt=new int[] {4, 5, 1};
int[] profit=new int[] {1, 2, 3};
System.out.println(knapsackRecursion(wt, profit, wt.length, 4));
	}

	private static int knapsackRecursion(int[] wt, int[] profit, int n, int capacity) {
		// TODO Auto-generated method stub
		if(n==0 || capacity==0)
			return 0;
		if(wt[n-1]>capacity)
		{
			return knapsackRecursion(wt,profit,n-1,capacity);
		}
		else
		{
			return Math.max(profit[n-1]+knapsackRecursion(wt,profit,n-1,capacity-wt[n-1]), knapsackRecursion(wt,profit,n-1,capacity) );
		}
		
	}

}
