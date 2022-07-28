package DynamicProgramming;

import java.util.LinkedList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] strs=new String[] {"leet","code"};
System.out.println(wordBreak("leetcode",strs));
	}
	//https://www.youtube.com/watch?v=iWenZCZEBIA&ab_channel=FisherCoder
	private static boolean wordBreak(String str, String[] strs) {
		// TODO Auto-generated method stub
		List<String> wordDict=new LinkedList<String>();
		for(String s:strs)
		{
			wordDict.add(s);
		}
		boolean[] dp=new boolean[str.length()+1];
		dp[0]=true;
		for(int i=0;i<=str.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				if(dp[j] && wordDict.contains(str.substring(j,i)))
				{
					dp[i]=true;
					System.out.println(str.substring(j,i));
					break;
				}
			}
		}
		return dp[str.length()];
	}

}
