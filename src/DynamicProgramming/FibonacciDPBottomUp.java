package DynamicProgramming;

public class FibonacciDPBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int[] nums=new int[6];

		nums[0]=0;

		nums[1]=1;
for(int i=2;i<=n;i++)
{
	nums[i]=nums[i-1]+nums[i-2];
}


	}

}
