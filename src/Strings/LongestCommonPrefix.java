package Strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs=new String[] {"flower","flow","flight"};
System.out.println(longestCommonPrefix(strs));
	}

	private static String longestCommonPrefix(String[] strs) {
		// TODO Auto-generated method stub
		if(strs.length==0)
		{
			return "";
			
		}
		String prefix=strs[0];
		for(int i=0;i<strs.length;i++)
		{while(strs[i].indexOf(prefix)!=0)
			prefix=prefix.substring(0, prefix.length()-1);
		if(prefix.isEmpty())return "";
			
		}return prefix;
	}

}
