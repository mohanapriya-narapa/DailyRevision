package SeventyFiveProblems;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {3,0,1};
int n=nums.length;
int total=n*(n+1)/2;
int sum=0;
for(int x:nums)
{
	sum+=x;
}
System.out.println(total-sum);
	}

}
