package DynamicProgramming;

public class UnboundKnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] price=new int[] {10, 40, 50, 70};
	int[] weight=new int[] {1, 3, 4, 5};
	System.out.println(unboundTopDown(price, weight, 8));

	}

	private static int unboundTopDown(int[] price, int[] weight, int w) {
		// TODO Auto-generated method stub
		int n=price.length;
		int[][] table=new int[price.length+1][w+1]; 
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=w;j++)
			{
				if(i==0 || j==0)
				{
				table[i][j]=0;
				}
				else if(weight[i-1]<=j)
				{
					 table[i][j]= Math.max(price[i-1]+table[i][j-weight[i-1]], table[i-1][j]);
				}
				else
				{
				table[i][j]=table[i-1][j];
				}
			}
		}
		return table[n][w];
	}

}
