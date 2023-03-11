package Recursion;

public class StepsToReduceNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(helper(14, 0));
	}

	private static int helper(int num, int steps) {
		// TODO Auto-generated method stub
if(num==0)return steps;
if(num%2==0) return helper(num/2, steps+1);
else
{
	return helper(num-1,steps+1);
}
	}

}