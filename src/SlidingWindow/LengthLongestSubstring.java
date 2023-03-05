package SlidingWindow;

public class LengthLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(LengthLongestSubstring("1101100111"));
	}

	private static int LengthLongestSubstring(String str) {
		// TODO Auto-generated method stub
int left=0;
int cur=0;
int ans=0;
for(int right=0;right<str.length();right++)
{
	if(str.charAt(right)=='0')
	{
		cur++;
	}
	while(cur>1)
	{
		if(str.charAt(left)=='0')
		{
			cur--;
		}
		left++;
	}
	ans=Math.max(ans, right-left+1);
}return ans;
	}

}
