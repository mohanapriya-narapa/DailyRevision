package tenProblemsLeetcodeChallenge;

public class isSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isSubsequence("abc", "ahbgdc"));
	}

	private static boolean isSubsequence(String s, String t) {
		// TODO Auto-generated method stub
int j=0;
for(int i=0;j<s.length() && i<t.length();i++)
{
	if(s.charAt(j)==t.charAt(i))
	{
		j++;
	}
}return s.length()==j;
	}

}
