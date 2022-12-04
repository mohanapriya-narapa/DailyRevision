package ctci_one;

public class stringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(StringCompression("aabcccccaaa"));
	}

	private static String StringCompression(String str) {
		// TODO Auto-generated method stub
		int count=0;String compression="";
		for(int i=0;i<str.length();i++)
		{
			count++;
			if(i+1>=str.length() || str.charAt(i)!=str.charAt(i+1))
			{
				compression+=""+str.charAt(i)+count;
				count=0;
			}
		}
		return compression;
	}

}
